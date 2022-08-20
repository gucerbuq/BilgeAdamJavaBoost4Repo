package com.bilgeadam.boost.week02.lesson005;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your birth year: ");
		int a = sc.nextInt();
		
		switch(a%12) {
		case 0:
			System.out.println("Your Chinese Zodiac is Monkey");
			break;
		case 1:
			System.out.println("Your Chinese Zodiac is Rooster");
			break;
		
		case 2:
			System.out.println("Your Chinese Zodiac is Dog");
			break;
		case 3:
			System.out.println("Your Chinese Zodiac is Pig");
			break;
		case 4:
			System.out.println("Your Chinese Zodiac is Mouse");
			break;
		case 5:
			System.out.println("Your Chinese Zodiac is Ox");
			break;
		case 6:
			System.out.println("Your Chinese Zodiac is Tiger");
			break;
		case 7:
			System.out.println("Your Chinese Zodiac is Rabbit");
			break;
		case 8:
			System.out.println("Your Chinese Zodiac is Dragon");
			break;
		case 9:
			System.out.println("Your Chinese Zodiac is Snake");
			break;
		case 10:
			System.out.println("Your Chinese Zodiac is Horse");
			break;
		case 11:
			System.out.println("Your Chinese Zodiac is Sheep");
			break;
			default:
				System.out.println("You don't have any.");
		}
	}

}
