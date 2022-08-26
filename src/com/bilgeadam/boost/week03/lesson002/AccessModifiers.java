package com.bilgeadam.boost.week03.lesson002;

public class AccessModifiers {

	public String publicVariable = "public değişken";
	
	protected String protectedVariable = "protected degisken";
	
	String defaultVariable = "defaulted degisken";
	
	private String privateVariable = "privated degisken";
	
	public static void main(String[] args) {
		
		AccessModifiers testObject = new AccessModifiers();
		
		System.out.println("Erisebildigim degiskenler "+testObject.publicVariable+ ", " + testObject.protectedVariable +", "+ testObject.defaultVariable + ", " +testObject.privateVariable+ ", ");
		
	}
		

	

}
