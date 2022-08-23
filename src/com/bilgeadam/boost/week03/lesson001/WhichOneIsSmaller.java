package com.bilgeadam.boost.week03.lesson001;

import java.util.Scanner;

public class WhichOneIsSmaller {

	public static void main(String[] args) {
		
		
		System.out.println(smaller(19,195));
		
		
		

	}
	
	public static int smaller(int n1, int n2) {
		
		int min;
		
	
		if(n1<n2) {
			min = n1;
		} else {
			min = n2;
		}
		
		return min;
		
	}

}
