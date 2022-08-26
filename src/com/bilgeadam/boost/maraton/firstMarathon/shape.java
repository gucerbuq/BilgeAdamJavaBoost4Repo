package com.bilgeadam.boost.maraton.firstMarathon;

import java.util.Scanner;

public class shape {

	static Scanner sc = new Scanner(System.in);
	static int count = 1;

	public void main(String[] args) {
		
		ShapeGettersSetters sgs = new ShapeGettersSetters();
		inputs();

	}

	public static double inputs() {

		while (true) {
			System.out.println("Hesaplamak istediğiniz şeklin (en fazla 4 kenar) kenar uzunluklarını giriniz (-1 ile çıkış) : ");
			System.out.println("Lütfen 1. kenar uzunluğunu giriniz (0 ile sonlandır) : ");
			double firstEdge = sc.nextDouble();
			
			if (firstEdge == -1) {
				
				break;
	
			} else if (firstEdge < -1 ) {
				
				System.out.println("Lütfen pozitif bir değer giriniz!");
				return inputs();
				
			} else if (firstEdge == 0) {
				
				System.out.println("En az üç kenar giriniz.");
				return inputs();
				
			}
			
			System.out.println("Lütfen 2. kenar uzunluğunu giriniz (0 ile sonlandır) : ");
			double secondEdge = sc.nextDouble();
			
			if (secondEdge == -1) {
				
				break;
	
			} else if (secondEdge < -1 ) {
				
				System.out.println("Lütfen pozitif bir değer giriniz!");
				return inputs();
				
			} else if (secondEdge == 0) {
				
				System.out.println("En az üç kenar giriniz.");
				return inputs();
				
				
			}
			
			System.out.println("Lütfen 3. kenar uzunluğunu giriniz (0 ile sonlandır) : ");
			double thirdEdge = sc.nextDouble();
			
			if (thirdEdge == -1) {
				
				break;
	
			} else if (thirdEdge < -1 ) {
				
				System.out.println("Lütfen pozitif bir değer giriniz!");
				return inputs();
				
			} else if (thirdEdge == 0) {
				
				System.out.println("En az üç kenar giriniz.");
				return inputs();			
				
			}
			System.out.println("Lütfen 4. kenar uzunluğunu giriniz (0 ile sonlandır) : ");
			double fourthEdge = sc.nextDouble();
			
			if (fourthEdge == -1) {
				
				break;
	
			} else if (fourthEdge < -1 ) {
				
				System.out.println("Lütfen pozitif bir değer giriniz!");
				return inputs();
				
			} else if (fourthEdge == 0) {
				double u = (firstEdge + secondEdge + thirdEdge)/2;
				double triangleArea = Math.sqrt(u*(u-firstEdge)*(u-secondEdge)*(u-thirdEdge));
				
				double circum = firstEdge + secondEdge + thirdEdge + fourthEdge;
				System.out.println(count + ". şeklin çevresi : " + circum);
				System.out.println(count + ". şeklin alanı : " + triangleArea);
				
			} else {
	
			double circum = firstEdge + secondEdge + thirdEdge + fourthEdge;
			System.out.println(count + ". şeklin çevresi : " + circum);

		
		

				
				double multi = firstEdge * secondEdge * thirdEdge * fourthEdge;
				System.out.println(count + ". şeklin alanı : " + multi);
			}
			
			count++;
			
		}
		return 0;
		
	}

}
