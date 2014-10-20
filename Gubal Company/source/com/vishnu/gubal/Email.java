package com.vishnu.gubal;

public class Email {
	
	int numEmail = 10, sentnum = 0;
	
	void view() {
		
		System.out.println("There are " + numEmail + " Emails in your Inbox");
		
	}
	
	void delete() {
		
		int upnum = --numEmail;
		System.out.println("There are " + upnum + " Emails in your Inbox");
		
	}
	
	void send() {
		
		int upsent = ++sentnum;
		
		System.out.println(upsent + " Emails sent");
		
	}

}
