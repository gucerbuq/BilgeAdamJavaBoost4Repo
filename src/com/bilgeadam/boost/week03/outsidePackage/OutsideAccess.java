package com.bilgeadam.boost.week03.outsidePackage;

import com.bilgeadam.boost.week03.lesson002.AccessModifiers;

public class OutsideAccess extends AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers testObject = new AccessModifiers();
		
		OutsideAccess testObj = new OutsideAccess();
		
		System.out.println("Erisebildigim degiskenler "+testObject.publicVariable+ ", " + testObject.protectedVariable +", "+ testObject.defaultVariable + ", " +testObject.privateVariable+ ", ");


	}

}
