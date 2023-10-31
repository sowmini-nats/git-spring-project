package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Exchange;
import com.example.demo.model.User;
import com.example.demo.service.ExchangeService;

@RestController
public class ExchangeController {
	@Autowired
	ExchangeService service;
	@PostMapping("/addRate")
	public String addRate(Exchange exchange) {
		service.addRate(exchange);
		return "New data added successfully";			
	}
	
	@PostMapping("/updateRate")
	public String updateRate(Exchange exchange) {
		service.addRate(exchange);
		return "Data updated successfully";			
	}
	
	@PostMapping("/calculaterate")
	public String calculateRate(String from,String to,int amount,Model model) {
		System.out.println(from);
		Iterable<Exchange>exchange = service.calculateRate();
		Iterator<Exchange> it=exchange.iterator();
		double total=0;
		while(it.hasNext()) {
			Exchange exchange1 =  it.next();
			  if(exchange1.getFromCurrency().equals(from)&&exchange1.getToCurrency().equals(to)) {
				  double rate = exchange1.getExchangeRate();
				  total = rate*amount;
			  }
			  
		}
		if(total!=0) {
		return "Your exchange amount "+ from + " to " + to +" is "+total;	
		}
		else
			return "Exchange Rate not available";
	}
}