package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Exchange;

@Repository
public interface ExchangeRepository extends CrudRepository<Exchange,Integer> {

}
