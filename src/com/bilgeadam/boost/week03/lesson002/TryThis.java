package com.bilgeadam.boost.week03.lesson002;

public class TryThis {
	
	int variable;
	
	int method(int variable) {
		//System.out.println(variable);
		return variable;
	}

	public static void main(String[] args) {
		
		int variable = 10;
		
		TryThis tryThis =  new TryThis();
		
		//System.out.println(tryThis.variable);
		
		
		System.out.println(tryThis.method(variable));
		
		

	}
	
	

}
