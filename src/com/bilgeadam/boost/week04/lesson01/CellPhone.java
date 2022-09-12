package com.bilgeadam.boost.week04.lesson01;

public class CellPhone {

	private String brand;
	private int cameraMP;
	private int batteryCapacity;
	private double screenSize;
	
	
	
	public CellPhone(String brand, int cameraMP, int batteryCapacity, double screenSize) {
		super();
		this.brand = brand;
		this.cameraMP = cameraMP;
		this.batteryCapacity = batteryCapacity;
		this.screenSize = screenSize;
	}

	public CellPhone() {
		super();
	}

	void connectWeb() {
		System.out.println(brand + " connected to web");
	}
	
	void showFeatures() {
		System.out.println("CellPhone [brand=" + brand + ", cameraMP=" + cameraMP + ", batteryCapacity=" + batteryCapacity
				+ ", screenSize=" + screenSize + "]");
	}
	
	void remainingBattery() {
		System.out.println(batteryCapacity + " has left");
	}
	
	void takePhoto() {
		System.out.println(cameraMP + " quality photo taken");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCameraMP() {
		return cameraMP;
	}

	public void setCameraMP(int cameraMP) {
		this.cameraMP = cameraMP;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	

}
