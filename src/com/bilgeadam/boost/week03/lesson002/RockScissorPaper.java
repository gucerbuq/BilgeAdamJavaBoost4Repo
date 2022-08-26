package com.bilgeadam.boost.week03.lesson002;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {
	
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	static int count1=0;
	static int count2=0;

	public static void main(String[] args) {
		while (true) {
		rsp(0);
		}
//		System.out.println(rsp(0));
		
		
	}
	
	public static int rsp(int n1) {
		
		while (true) {
			System.out.println("Choose your move \n 1 - Rock \n 2 - Scissor \n 3 - Paper");
			n1 = sc.nextInt();
			
			int n2 = random.nextInt(4);
			System.out.println(n2);
			
			if (n1==n2)	{
				System.out.println("Tie!");
				count1++;
				count2++;
				
			} else if (n1 == 1) {
				if (n2==2) {
					System.out.println("Rock wins!");
					count1++;
				} else {
					System.out.println("Paper wins!");
					count2++;
				}			
			} else if (n1 == 2) {
				if (n2==1) {
					System.out.println("Rock wins!");
					count2++;
				} else {
					System.out.println("Scissor wins!");
					count1++;
				}			
			} else {
				if(n2==1) {
					System.out.println("Paper wins!");
					count1++;
				} else {
					System.out.println("Scissor wins!");
					count2++;
				}			
			}
			
			System.out.println(count1 + " - " + count2);
			
			return n1;
		}
	}

}
