package com.bilgeadam.boost.week02.lesson005;

import java.util.Scanner;

public class ObebOkek {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first number: ");
//		int a = sc.nextInt();
//		System.out.println("Enter second number: ");
//		int b = sc.nextInt();
//		
//		
//		
//		for (int i=1;(i<=a) && (i<=b);i++) {
//			if ((a%i==0) && (b%i==0)) {
//				System.out.println(i);
//
//				}
//			}
//		}
		
		int temp;
		int hcf = 1;
		int lcm = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number:");
		int number1 = scanner.nextInt();
		System.out.println("Please enter second number:");
		int number2 = scanner.nextInt();		
		if(number1>number2) {
			temp = number2;
		}else {
			temp = number1;
		}
		while(temp>0) {
			if(number1%temp==0 && number2%temp==0) {
				hcf = temp;
				break;
			}
			temp--;
		}		
		temp=1;
		while(temp<= number1*number2) {
			temp++;
			if(temp%number1==0 && temp%number2==0) {
				lcm = temp;
				break;
			}
		}	
		System.out.println(number1+" "+number2+" lcm : " +lcm);
		System.out.println(number1+" "+number2+" hcf : " +hcf);
		
	}

}
