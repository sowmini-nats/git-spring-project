package com.example.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repositories.CustomerRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	
	public Iterable<Customer> getAllAgentCustomers(HttpServletRequest request) {
		HttpSession session = request.getSession();
		int userId = Integer.parseInt(session.getAttribute("userId").toString()); 
		Iterable<Customer> customer = customerRepository.findAll();
		Iterator<Customer> it=customer.iterator();
		Iterable<Customer> customerList = null;
		List<Customer> customerList1=new ArrayList<Customer>();
		while(it.hasNext()) {
			Customer customer1 =  it.next();
			  if(userId==customer1.getUser().getUserId()) {
				  customerList1.add(customer1);
			  }
			  customerList = customerList1;
		}
		
		return customerList;
	}
	public Iterable<Customer> getAllCustomers() {
		Iterable<Customer> customer = customerRepository.findAll();
		return customer;
	}
	public void addCustomer(Customer customer) {
//		customer.setCustDob(customer.custDob));
		customerRepository.save(customer);
	}
	
	public Customer getCustomer(int id) {
		Customer customer = customerRepository.findById(id).get();
		return customer;
	}
}
