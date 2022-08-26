package com.bilgeadam.boost.week03.lesson002;

import java.util.Scanner;

public class lesson003 {
	
	static boolean endMenu = true;
	static boolean endProgram = true;
	static final String username = "user";
	static final String password = "123";
	static int count = 3;
	static double balance = 1500;
	static double amount;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("Please enter your username : ");
		String usernameEntry = scanner.nextLine();
		System.out.println("Please enter your password : ");
		String passwordEntry = scanner.nextLine();
		
		if (!usernameEntry.equals(username) || !passwordEntry.equals(password)) {
			System.out.println("Username or password wrong!");
			count--;
			
			if(count==0) {
				System.out.println("Your card is blocked.");
				endProgram=false;
			}else {
				System.out.println("Remaining attempt : " + count);
				
			}
		}else {
			count = 3;
			System.out.println("Welcome!" + username);
			System.out.println("1 - Deposit cash\n2-Withdraw cash\n3 - Balance inquiry\n4 - Exit");
			int selection = scanner.nextInt();
			
			switch (selection) {
			case 1:
				System.out.println("Please enter amount of deposit cash : ");
				amount = scanner.nextDouble();
				balance = balance + amount;
				System.out.println(amount + " is depositted to your balance. Your new balance is : "+balance);
				
				break;
			case 2:
				System.out.println("Please enter the amount of withdraw : ");
				amount = scanner.nextDouble();
				if (amount>balance) {
					System.out.println("You dont have enough money.");
				}else {
					balance = balance - amount;
					System.out.println(amount + " is depositted to your balance. Your new balance is : "+balance);

				}
				break;
			case 3:
				System.out.println("Your balance : "+balance);
	
				break;
			case 4:
				endMenu = false;
				endProgram = false;
				
	
				break;
			default:
				System.out.println("Invalid input. ");
				break;
			}
		}
		
		}
		
	}

}
