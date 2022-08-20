package com.bilgeadam.boost.week02.lesson002;

import java.util.Scanner;

public class WhatIsYourName {

	public static void main(String[] args) {
		
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name : ");
		
		name = scan.nextLine();
		
		System.out.println("Hello " + name);

	}

}
