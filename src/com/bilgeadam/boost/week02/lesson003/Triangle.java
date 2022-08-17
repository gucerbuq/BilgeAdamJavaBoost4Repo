package com.bilgeadam.boost.week02.lesson003;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
//		double x=0;
//		Math.cos(x);
//		x=Math.PI;
//		
//		Math.pow(x, 2);
//		Math.toRadians(x);
		
		double x,y,z,a,b,c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first angle: ");
		x = scan.nextDouble();
		System.out.println("Enter line length for first angle: ");
		a = scan.nextDouble();
		System.out.println("Enter second angle: ");
		y = scan.nextDouble();
		System.out.println("Enter line length for second angle: ");
		b = scan.nextDouble();

		z = 180 - (x+y);
		double zRad = Math.toRadians(z);
		
		double temp = Math.pow(a,2) + (b*b) - (2*a*b*(Math.cos(z)));
		
		Math.pow(temp, 0.5);
		
		c = Math.sqrt(temp);
		
		System.out.println("Third angle is: " + z);
		System.out.println("Third line length is: " + c);
	}

}
