package com.bilgeadam.boost.week02.lesson005;

public class TrianglesWithStars {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 8; i+=2) {
			int count=0;
			do {
				System.out.print("*");
				count++;
			} while (count<i);
			System.out.println();
		}

	}

}
