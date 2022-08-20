package com.bilgeadam.boost.week02.lesson005;

import java.util.Scanner;

public class RegisterLogin {

	public static void main(String[] args) {
		
		String username = "gucerbuq";
		int password = 1234;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("For Login Press [1], For Register Press [2]: ");
		int a = sc.nextInt();
		
		if(a==1) {
			System.out.println("Enter your username: ");
			String user1 = sc.next();
			if(user1==username) {
				System.out.println("Enter your password: ");
				int pass = sc.nextInt();
				if(pass==password) {
					System.out.println("Logged in Succesfully!");
				}else {
					System.out.println("Password is not correct! Try Again.");
				}
			}else {
				System.out.println("Username is not correct! Try Again.");
			}
		} else if (a==2) {
			System.out.println("Create a username: ");
			username = sc.next();
			System.out.println("Create a password: ");
			password = sc.nextInt();
		}else {
			System.out.println("No such a thing!");
		}
		
		
		
		

	}

}
