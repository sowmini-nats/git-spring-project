package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.model.User;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.UserRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class LoginService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	public String validateUser(int userId, String password,String path, HttpServletRequest request) {
		HttpSession session = request.getSession();
		if(path.equals("Staff")) {
		User user = userRepository.findById(userId).get();
		String status="Active";
		if(user != null) {
			if(password.equals(user.getPassword())&&status.equals(user.getStatus())){
				session.setAttribute("userId",user.getUserId());
				session.setAttribute("role",user.getRole());
				return "Login successful "+session.getAttribute("role");	
			}
			else
				return "Invalid Password";
		}
		else
			return "No user exists";
		}else {
			Customer customer = customerRepository.findById(userId).get();
			if(customer != null) {
				if(password.equals(customer.getCustPhoneNumber())){
					session.setAttribute("userId",customer.getCustId());
					session.setAttribute("role","Customer");
					return "Login successful "+session.getAttribute("role");	
				}
				else
					return "Invalid Password";
			}
			else
				return "No user exists";
		}
		
		
	}
	
	public Iterable<User> getAllUsers() {
		Iterable<User> users=userRepository.findAll();
		return users;
	}
}
