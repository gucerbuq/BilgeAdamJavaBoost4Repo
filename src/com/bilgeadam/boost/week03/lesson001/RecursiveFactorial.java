package com.bilgeadam.boost.week03.lesson001;

public class RecursiveFactorial {

	public static void main(String[] args) {
		
		int result = factorial(4);
		System.out.println(result);
		
	}
	
	public static int factorial(int n) {
		
		if(n!=0) {
			return n*factorial(n-1);
		}else {
			return 1;
		}
		
		
		
	}

}
