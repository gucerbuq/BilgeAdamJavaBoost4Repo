package com.bilgeadam.boost.week03.lesson003;

public class BreakContinue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if(i==5) {
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println("Outside of loop.");

	}

}
