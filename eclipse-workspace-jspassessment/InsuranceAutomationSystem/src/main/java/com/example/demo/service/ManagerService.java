package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;

@Service
public class ManagerService {
	@Autowired
	UserRepository userRepository;
	
	public Iterable<User> getAllUsers() {
		Iterable<User> users=userRepository.findAll();
		return users;
	}

	public void updateAgent(int id) {
		User user = userRepository.findById(id).get();
		System.out.println(user);
		String value1="Active";
		String value2="Inactive";
		if(value1.equals(user.getStatus())){
			String status="Inactive";
			user.setStatus(status);
			userRepository.save(user);
		}
		else if(value2.equals(user.getStatus())) {
			String status="Active";
			user.setStatus(status);
			userRepository.save(user);
		}
	}

	public void addAgent(User user) {
		userRepository.save(user);
	}
}
