package com.lumen.abs;

public  abstract class Vehicle {
	String model;
	String brand;
	double price;
	
	public Vehicle(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	
	}
	void printDetails() {
		System.out.println("model "+model);
		System.out.println("brand "+brand);
		System.out.println("price "+price);
		
		
	}
	abstract void getMilage();
	abstract void showType();
	

}
