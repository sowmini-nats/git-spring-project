package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Account;
import com.example.demo.entities.User;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.repositories.UserRepository;

@SpringBootApplication
public class SpringJpaBankApplication {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("Select an option:");
//			System.out.println("1.Register user");
//			System.out.println("2.Deposit amount");
//			System.out.println("3.Check balance");
//			System.out.println("4.Remove user account");
//			System.out.println("5.Exit...");
//			int value = sc.nextInt();
//			if(value==5) {
//				System.out.println("Thank you!");
//				break;
//			}
//		}
		
		SpringApplication.run(SpringJpaBankApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(UserRepository repository, AccountRepository repository1) {
		return(args)->{
//			System.out.println("New user account creation:");
//			repository.save(new User("pass1","Sowmini","Chennai",0));
//			repository.save(new User("pass2","Sona","Chennai",0));
//			repository.save(new User("pass3","Sangeetha","Chennai",0));
//			repository.save(new User("pass4","Sneha","Chennai",0));
//			repository.save(new User("pass5","Arthi","Chennai",0));
//			System.out.println("List of all users registered:");
//			repository.findAll().forEach(System.out::println);
//			
//			System.out.println("Deposit amount:");
//			User user1 = repository.findById(2).get();
//			int total1 = user1.getBalance()+2000;
//			user1.setBalance(total1);
//			repository.save(user1);
//			System.out.println("List of all users registered:");
//			repository.findAll().forEach(System.out::println);
//			
//			System.out.println("Withdraw amount:");
//			User user2 = repository.findById(2).get();
//			if(user2.getBalance()>=200) {
//				int total2 = user2.getBalance()-200;
//				user2.setBalance(total2);
//				repository.save(user2);
//			}
//			else {
//				System.out.println("Insufficient balance");
//			}
//			
//			System.out.println("Delete user:");
//			User user3 = repository.findById(5).get();
//			repository.delete(user3);
//			System.out.println("List of all users registered");
//			repository.findAll().forEach(System.out::println);
			System.out.println("New user created:");
			User user1 = new User("pass1","Sowmini","Chennai");
			Account acc1 = new Account(0);
			acc1.setUser(user1);
			repository.save(user1);
			repository1.save(acc1);
			User user2 = new User("pass2","Sangeetha","Chennai");
			Account acc = new Account(0);
			acc.setUser(user2);
			repository.save(user2);
			repository1.save(acc);
			
			System.out.println("Deposit amount:");
			Account acc2 = repository1.findById(1).get();
			int total1 = acc2.getBalance()+2000;
			acc2.setBalance(total1);
			repository1.save(acc2);
			System.out.println("List of all users registered:");
			repository.findAll().forEach(System.out::println);
			System.out.println(repository.findById(1).get().getAccount());
			
			System.out.println("Withdraw amount:");
			Account acc3 = repository1.findById(2).get();
			if(acc3.getBalance()>=200) {
				int total2 = acc3.getBalance()-200;
				acc3.setBalance(total2);
				repository1.save(acc3);
			}
			else {
				System.out.println("Insufficient balance");
			}
			
			System.out.println("Delete user:");
			User user3 = repository.findById(2).get();
			repository.delete(user3);
			System.out.println("List of all users registered");
			repository.findAll().forEach(System.out::println);
			};
	}
}
