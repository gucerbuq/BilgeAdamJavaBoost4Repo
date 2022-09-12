package com.bilgeadam.boost.week04.lesson01;

public class CellPhoneTest {

	public static void main(String[] args) {
		
		CellPhone cp = new CellPhone();
		cp.setBatteryCapacity(100);
		cp.setBrand("Nokia");
		cp.setCameraMP(19);
		cp.setScreenSize(7);
		
		cp.connectWeb();
		cp.showFeatures();
		cp.remainingBattery();
		cp.takePhoto();

	}

}
