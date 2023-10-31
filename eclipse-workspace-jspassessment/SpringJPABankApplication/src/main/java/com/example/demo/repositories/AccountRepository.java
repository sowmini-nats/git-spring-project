package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account,Integer>{
	
}
