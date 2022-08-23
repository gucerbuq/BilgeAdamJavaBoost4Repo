package com.bilgeadam.boost.week03.lesson001;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening
		int myInt = 9;
		double myDouble = myInt; //Automoatic Casting: int to double
		
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println("---");
		
		//narrowing
		double myDouble2 = 9.78d;
		int myInt2 = (int) myDouble2; //Manuel Casting: double to int
		
		System.out.println(myDouble2);
		System.out.println(myInt2);
		System.out.println("---");
		
		// 
		int num = 10;
		System.out.println("The integer value is : " + num);
		
		String data = String.valueOf(num); // Converts int to String // int değeri String değere çeviriyiyorum
		System.out.println("The string value is : "+ data);
		System.out.println("---");
		
		//int result = data + 5
		
		// Type conversion from string to int
		String data2 = "10";
		System.out.println("The string valu is : "+data2);
		
		int num2 = Integer.parseInt(data2);  // converts String to int
		System.out.println("The integer value is : "+num2);
		System.out.println("---");
		
		
		

	}

}
