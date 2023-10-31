package com.demo.hibernatebank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String password;
	private String name;
	private String place;
	public Users() {
		super();
	}
	public Users(int userid, String password, String name, String place) {
		super();
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.place = place;
	}
	public Users(String password, String name, String place) {
		super();
		this.password = password;
		this.name = name;
		this.place = place;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", password=" + password + ", name=" + name + ", place=" + place + "]";
	}
	
}


 


	
	
	
	