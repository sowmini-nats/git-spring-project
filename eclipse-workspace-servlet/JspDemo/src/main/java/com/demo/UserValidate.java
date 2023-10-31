package com.demo;

public class UserValidate {
	public boolean isValidUser(String username,String password) {
		if(username.equals("tester")&&password.equals("tester")) {
			return true;
		}
		else 
			return false;
	}
}
