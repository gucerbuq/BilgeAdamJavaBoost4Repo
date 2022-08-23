package com.bilgeadam.boost.week03.lesson001;

import java.util.Scanner;

public class Ranking {

	public static void main(String[] args) {
		
		grades(0);

	}
	
	public static int grades(int n1) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player strength : ");
		n1 = sc.nextInt();
		
		if(n1>200.5) {
			System.out.println("Player Rank is A!");
		} else if(n1>122.4) {
			System.out.println("Player Rank is B.");
		} else {
			System.out.println("Player Rank is C :'(");
		}
		
		return n1;
		
		
	}

}
