package com.message;

public class EmailMessageService implements MessageService{
	public String sendMessage(String msg) {
		return "Email sent " + msg;
	}
}
