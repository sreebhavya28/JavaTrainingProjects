package com.lumen.abs;

public class Car  extends Vehicle{

	double milage;
	public Car(String model, String brand, double price,double milage) {
		super(model, brand, price);
		this.milage=milage;
	}
	@Override
	void getMilage() {
		System.out.println("car milage :"+milage);
		
		
	}
	@Override
	void showType() {
		System.out.println( "its is a" +model+"model");
		
	}
	void showAccessories(String...vararray) {
		for(String accessory: vararray) {
			System.out.println(accessory);
		}
	}

}
