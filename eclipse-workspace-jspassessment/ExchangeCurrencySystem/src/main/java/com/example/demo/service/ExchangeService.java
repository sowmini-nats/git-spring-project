package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Exchange;
import com.example.demo.model.User;
import com.example.demo.repositories.ExchangeRepository;

@Service
public class ExchangeService {

	@Autowired
	ExchangeRepository exchangeRepository;

	public Exchange addRate(Exchange exchange) {
		return exchangeRepository.save(exchange);
	}
	
	public Exchange updateRate(Exchange exchange) {
		return exchangeRepository.save(exchange);
	}

	public Iterable<Exchange> calculateRate() {
		Iterable<Exchange> list=exchangeRepository.findAll();
		return list;
	}
}
