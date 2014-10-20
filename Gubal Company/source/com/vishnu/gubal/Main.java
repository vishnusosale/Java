package com.vishnu.gubal;

public class Main {

	public static void main(String[] args) {

		Email acc1 = new Email();

		System.out.println("Select an option:");
		System.out.println("1. View\n2. Delete\n3. Send");

		int option = 2;

		switch (option) {

		case 1:
			acc1.view();
			break;
		case 2:
			acc1.delete();
			break;
		case 3:
			acc1.send();
			break;
		default:
			System.out.println("Enter correct option");
		}

	}

}
