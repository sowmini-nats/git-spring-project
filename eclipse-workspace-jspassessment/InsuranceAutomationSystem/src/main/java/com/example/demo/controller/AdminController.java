package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Customer;
import com.example.demo.model.Policy;
import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.service.CustomerService;
import com.example.demo.service.PolicyService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	CustomerService customerService;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PolicyService policyService;
	
	@GetMapping("/customer-list")
	public String getCustomers(HttpServletRequest request,Model model) {
		HttpSession session = request.getSession();
		if(session.getAttribute("role").equals("Admin")) {
		Iterable<Customer> customerAgentList = customerService.getAllCustomers();
		model.addAttribute("customerAgentList", customerAgentList);
		return "CustomerView";
		}
		else return("redirect:/home");
	}
	
	@GetMapping("/agent-list")
	public String getAgents(HttpServletRequest request,Model model) {
		HttpSession session = request.getSession();
		if(session.getAttribute("role").equals("Admin")) {
		Iterable<User> agentList1 = userRepository.findAll();
		Iterator<User> it=agentList1.iterator();
		List<User> user1=new ArrayList<User>();
		Iterable<User> agentList = null;
		while(it.hasNext()) {
			  User user =  it.next();
			  if(user.getRole().equals("Agent")) {
				  user1.add(user);
			  }
			  agentList = user1;
		}
		model.addAttribute("agentList",agentList);
		return "AgentList";
		}
		else return("redirect:/home");
	}
	
	@GetMapping("/policy-list")
	public String getPolicy(HttpServletRequest request,Model model) {
		HttpSession session = request.getSession();
		if(session.getAttribute("role").equals("Admin")) {
		Iterable<Policy> policyList = policyService.getAllPolicyDetails();
		model.addAttribute("policyList", policyList);
		return "PolicyView";
		}
		else return("redirect:/home");
	}
	
}