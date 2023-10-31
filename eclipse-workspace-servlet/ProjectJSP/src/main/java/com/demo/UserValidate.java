package com.demo;

public class UserValidate {
	String role;
	public boolean isValidUser(String username,String password) {
		if(username.equals("admin")&&password.equals("admin")) {
			role="Admin";
			return true;
		}
		else if(username.equals("tester")&&password.equals("tester")) {
			role="User";
			return true;
		}
		else {
			return false;
		}
	}
	public String getRole() {
		return role;
	}
}
