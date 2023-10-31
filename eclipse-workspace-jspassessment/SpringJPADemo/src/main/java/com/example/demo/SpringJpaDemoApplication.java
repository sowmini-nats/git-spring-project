package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@SpringBootApplication
public class SpringJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}
		@Bean
		public CommandLineRunner demo(ProductRepository repository) {
			return(args)->{
				repository.save(new Product("Java","Book",2300));
				repository.save(new Product("Spring","Book",4000));
				repository.save(new Product("MySql","Book",2000));
				System.out.println("List of all products before update");
				repository.findAll().forEach(System.out::println);
				Product prdObj = repository.findById(2).get();
				prdObj.setPrdName("Spring Boot");
				prdObj.setPrdPrice(3000);
				repository.save(prdObj);
				repository.save(new Product("C++","Book",1000));
				System.out.println("List of all products after update");
				repository.findAll().forEach(System.out::println);
				Product prdObj1 = repository.findById(2).get();
				repository.delete(prdObj1);
				System.out.println("List of all products after delete");
				repository.findAll().forEach(System.out::println);
			};
			
		}
}
