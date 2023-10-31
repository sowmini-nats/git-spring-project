package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.model.Policy;
import com.example.demo.repositories.PolicyRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Service
public class PolicyService {
	@Autowired
	PolicyRepository policyRepository;
	
	public void savePolicy(Policy policy) {
		policyRepository.save(policy);
	}
	
	public Iterable<Policy> getPolicyDetails(HttpServletRequest request){
		HttpSession session = request.getSession();
		int userId = Integer.parseInt(session.getAttribute("userId").toString());
		Iterable<Policy> policyList = policyRepository.findAll();
		Iterator<Policy> it=policyList.iterator();
		Iterable<Policy> policyLists = null;
		List<Policy> policyList1=new ArrayList<Policy>();
		while(it.hasNext()) {
			Policy policy1 =  it.next();
			  if(userId==policy1.getCustomer().getUser().getUserId()) {
				  policyList1.add(policy1);
			  }
			  policyLists = policyList1;
		}
		
		return policyLists;
	}
	
	public Iterable<Policy> getAllPolicyDetails(){
		Iterable<Policy> policyList = policyRepository.findAll();
		return policyList;
	}
	
	public Policy getPolicyById(int id) {
		return policyRepository.findById(id).get();
		
	}

	public void updateApprovePolicyStatus(int id) {
		Policy policy = policyRepository.findById(id).get();
		policy.setPolicyStatus("Approved");
		policyRepository.save(policy);
	}
	
	public void updateRejectPolicyStatus(int id) {
		Policy policy = policyRepository.findById(id).get();
		policy.setPolicyStatus("rejected");
		policyRepository.save(policy);
	}

	public Iterable<Policy> getPolicyDetailsOfCustomer(HttpServletRequest request) {
		HttpSession session = request.getSession();
		int userId = Integer.parseInt(session.getAttribute("userId").toString());
		Iterable<Policy> policyList = policyRepository.findAll();
		Iterator<Policy> it=policyList.iterator();
		Iterable<Policy> policyLists = null;
		List<Policy> policyList1=new ArrayList<Policy>();
		while(it.hasNext()) {
			Policy policy1 =  it.next();
			  if(userId==policy1.getCustomer().getCustId()) {
				  policyList1.add(policy1);
			  }
			  policyLists = policyList1;
		}
		
		return policyLists;
	}

}
