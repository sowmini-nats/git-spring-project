package com.message;

public class SMSMessageService implements MessageService{
	public String sendMessage(String msg) {
		return "SMS sent " + msg;
	}
}
