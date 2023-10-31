package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.UserRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import com.example.demo.model.User;

@Service
public class LoginService {
	@Autowired
	UserRepository userRepository;
	
	public String checkValidate(int userId, String password,HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = userRepository.findById(userId).get();
		if(user!=null) {
			if(user.getPassword().equals(password)) {
				session.setAttribute("userId", userId);
				return "Login Successful";
				
			}
			else {
				return "Invalid Credential";
			}
		}
		
		return "false";
		
	}
}
