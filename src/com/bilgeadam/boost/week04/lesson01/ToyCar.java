package com.bilgeadam.boost.week04.lesson01;

import java.util.Scanner;

public class ToyCar {
	
	Scanner sc = new Scanner(System.in);

	private int batteryCaapcity = 100;
	public int distanceX;
	public int distanceY;

	public ToyCar() {
		super();
	}

	public ToyCar(int batteryCaapcity, int distanceX, int distanceY) {
		super();
		this.batteryCaapcity = batteryCaapcity;
		this.distanceX = distanceX;
		this.distanceY = distanceY;
	}

	private void remainingBattery() {
		
		System.out.println(batteryCaapcity);

	}

	void movementX() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("X yönünde gerçekleşecek hareket miktarını metre cinsinden giriniz : ");
		this.distanceX = sc.nextInt();
		
		if (this.batteryCaapcity - this.distanceX < 0) {
			
			System.out.println("Araba " + this.batteryCaapcity + " metre yol gittikten sonra şarjı tükendi.");
			
		} else if (this.distanceX  < 0) {
			
			System.out.println("Lütfen pozitif bir tamsayı giriniz : ");
			this.distanceX = sc.nextInt();
			
		} else {
			
			this.batteryCaapcity = this.batteryCaapcity - this.distanceX;
			System.out.println("Araba X yönünde " + this.distanceX + " metre hareket etti. Kalan şarj miktarı %" + this.batteryCaapcity + ".");
			
		}

	}

	void movementY() {
		
		System.out.println("Y yönünde gerçekleşecek hareket miktarını metre cinsinden giriniz : ");
		this.distanceY = sc.nextInt();
		
		if (this.batteryCaapcity - this.distanceY < 0) {
			
			System.out.println("Araba " + this.batteryCaapcity + " metre yol gittikten sonra şarjı tükendi.");
			
		} else if (distanceY  < 0) {
			
			System.out.println("Lütfen pozitif bir tamsayı giriniz : ");
			this.distanceY = sc.nextInt();
			
		} else {
			
			this.batteryCaapcity = this.batteryCaapcity - this.distanceY;
			System.out.println("Araba Y yönünde " + this.distanceY + " metre hareket etti. Kalan şarj miktarı %" + this.batteryCaapcity + ".");
			
		}

	}

	void recharge() {
		
		System.out.println("Arabanızı ne kadar süre şarj edeceksiniz? : ");
		int recharge = sc.nextInt();
		
		if (this.batteryCaapcity + recharge > 100) {
			
			System.out.println("Arabanın şarjı %" + 100);
			
		} else if (recharge < 0 ) {
			
			System.out.println("Lütfen pozitif bir tamsayı giriniz : ");
			recharge = sc.nextInt();
			
		} else {
			
			System.out.println("Arabanın şarjı %" + (this.batteryCaapcity + recharge));
			
		}

	}

	public int getBatteryCaapcity() {
		return batteryCaapcity;
	}

	public void setBatteryCaapcity(int batteryCaapcity) {
		this.batteryCaapcity = batteryCaapcity;
	}

	public int getDistanceX() {
		return distanceX;
	}

	public void setDistanceX(int distanceX) {
		this.distanceX = distanceX;
	}

	public int getDistanceY() {
		return distanceY;
	}

	public void setDistanceY(int distanceY) {
		this.distanceY = distanceY;
	}

}
