package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Customer;
import com.example.demo.model.Policy;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.service.PolicyService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/policy")
public class PolicyController {
	@Autowired
	PolicyService policyService; 
	
	@Autowired
	CustomerRepository customerRepository;
	@GetMapping("/add-policy/{id}")
	public ModelAndView displayPolicyForm(@PathVariable("id") int id,HttpServletRequest request) {
		HttpSession session = request.getSession();
		if(session.getAttribute("role").equals("Agent")) {
			ModelAndView mv = new ModelAndView();
			Customer customer = customerRepository.findById(id).get();
			mv.addObject("id", id);
			mv.addObject("custAge", customer.getCustAge());
			mv.addObject("policy",new Policy());
			mv.setViewName("AddPolicy");
			return mv;
		}
		else {
			ModelAndView mv = new ModelAndView("redirect:/login");
			return mv;
		}
	}
	@PostMapping("/add-policy")
	public ModelAndView addNewPolicy(Policy policy) {
		policyService.savePolicy(policy);
		ModelAndView mv = new ModelAndView("redirect:/policy/policy-details");
		return mv;
	}
	
	@GetMapping("/policy-details")
	public ModelAndView displayPolicyDetail(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String roleType="Agent";
		if(roleType.equals(session.getAttribute("role"))) {
		Iterable<Policy> policyList = policyService.getPolicyDetails(request);
		ModelAndView mv = new ModelAndView();
		mv.addObject("policyList", policyList);
		mv.setViewName("PolicyView");
		return mv;
		}
		else {
			ModelAndView mv = new ModelAndView("redirect:/home");
			return mv;
		}
		
	}

}
