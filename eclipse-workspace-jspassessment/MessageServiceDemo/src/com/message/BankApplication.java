package com.message;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Account created";
		MessagingClient client = new MessagingClient(new EmailMessageService());
		client.sendNotification(msg);
	}

}
