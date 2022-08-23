package com.bilgeadam.boost.week03.lesson001;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		user("",0);
		

	}
	
	public static void user(String name, int password) {
		
		String username = "gucerbuq";
		int password1 = 1234;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username : ");
		String user1 = sc.nextLine();
		
		if(user1.equals(username)) {
			System.out.println("Enter your password : ");
			int pass1 = sc.nextInt();
			
			if(pass1==password1) {
				System.out.println("Login succesful!");
				menu();
			}else {
				System.out.println("Wrong Password");
			}
		}else {
			System.out.println("Wrong username");
		}
		
	}
	
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		double budget = 15000;
		
		System.out.println("[1] - Deposit");
		System.out.println("[2] - Withdraw");
		System.out.println("[3] - Balanca Inquiry");
		System.out.println("[4] - Exit");
		System.out.println("Enter the number of transaction : ");
		int key = sc.nextInt();
		
		switch (key) {
		case 1:
			System.out.println("Enter the amount of deposit : ");
			double add = sc.nextDouble();
			
			double newBudget = add + budget;
			
			System.out.println("New budget : " + newBudget + " TL");
		
		case 2:
			System.out.println("Enterthe amount of withdraw : ");
			double take = sc.nextDouble();
			
			if (take <= budget) {
				double newBudget2 = budget - take;
				
				System.out.println("New budget : " + newBudget2 + " TL");
			}else {
				System.out.println("Insufficient budget!");
			}
		case 3:
			System.out.println(budget + "TL");
		case 4:
			System.out.println("Log out succesful!");
		default:
		}
		
	}

}
