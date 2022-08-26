package com.bilgeadam.boost.week03.lesson003;

public class Item {

	private String name;
	private String unit;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getVatRate() {
		return vatRate;
	}

	public void setVatRate(int vatRate) {
		this.vatRate = vatRate;
	}

	private double unitPrice;
	private int vatRate;

	public static void main(String[] args) {

	}

}
