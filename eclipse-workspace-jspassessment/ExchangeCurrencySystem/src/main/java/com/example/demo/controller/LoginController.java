package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.LoginService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	@Autowired
	LoginService service;
	@GetMapping("/login")
	public String displayLogin() {
		return "loginPage";
	}
	
	@PostMapping("/login")
	public String loginValidate(int userId,String password,HttpServletRequest request) {
		String value = service.checkValidate(userId, password, request);
		if(value.equals("false")) {
			return "redirect:/home";
		}
		else return "redirect:/home";
	}
	
	@GetMapping("/home")
	public String displayHome() {
		return "HomePage";
	}
	
	@GetMapping("/admin")
	public String displayAdminPage() {
		return "AdminPage";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/home";
	}
	@GetMapping("/add-rate")
	public String displayCurrencyAdd(){
		return "CurrencyAdd";
	}
	@GetMapping("/update-rate")
	public String displayCurrencyUpdate(){
		return "CurrencyUpdate";
	}
}
