package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@GetMapping("/hellojsp")
	//@ResponseBody - httpresponse ---view response
	public String getHelloJsp(){
		return "hello"; 
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String getHello(){
		return "hello from demo controller"; 
	}
}
