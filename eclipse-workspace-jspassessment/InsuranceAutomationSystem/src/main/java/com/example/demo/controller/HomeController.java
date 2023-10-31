package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String displayHome() {
		return "home";
	}
	
	@GetMapping("/customer")
	public String displayCustomerPage() {
		return "CustomerView";
	}
	
	@GetMapping("/lifecare")
	public String displayLifeCare() {
		return "LifeCare";
	}
	
	@GetMapping("/homecare")
	public String displayLHomeCare() {
		return "HomeCare";
	}
	
	@GetMapping("/childcare")
	public String displayChildCare() {
		return "ChildCare";
	}
	
	@GetMapping("/healthcare")
	public String displayHealthCare() {
		return "HealthCare";
	}
	
	@GetMapping("/vehiclecare")
	public String displayVehicle() {
		return "VehicleCare";
	}

	@GetMapping("/premium-calculator")
	public String displayCalculator() {
		return "PremiumCalculator";
	}


}
