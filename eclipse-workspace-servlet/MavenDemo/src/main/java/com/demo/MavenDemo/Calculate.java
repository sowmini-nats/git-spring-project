package com.demo.MavenDemo;

public class Calculate {
	
	public int addNum(int a,int b) {
		return a+b;
	}
	public boolean oddNum(int a) {
		if(a%2!=0)
			return true;
		else return false;
	}
	public boolean evenNum(int a) {
		if(a%2==0)
			return true;
		else return false;
	}
	public int div(int a,int b) {
		return a/b;
	}
}