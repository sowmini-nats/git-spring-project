package com.demo.hibernatebank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountid;
	private int balance;
	@OneToOne
	@JoinColumn(name = "userid", referencedColumnName = "userid")	
	private Users user;
	public Account() {
		super();
	}
	public Account(int accountid, int balance, Users user) {
		super();
		this.accountid = accountid;
		this.balance = balance;
		this.user = user;
	}
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", balance=" + balance + ", user=" + user + "]";
	}
}
