package com.bilgeadam.boost.week03.lesson001;

import java.util.Scanner;

public class IsDouble {

	public static void main(String[] args) {
		
		isDouble(0);

	}
	
	public static int isDouble(int n1) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n1 = sc.nextInt();
		
		switch (n1%2) {
		case 0:
			System.out.println(n1 + " is double.");
		case 1:
			System.out.println(n1 + " is odd.");
		default:
			
		}
		
		return n1;
		
	}

}
