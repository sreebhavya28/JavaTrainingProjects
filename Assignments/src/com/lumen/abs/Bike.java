package com.lumen.abs;

public class Bike extends Vehicle {

	double milage;
	String enginetype;

	public Bike(String model, String brand, double price,double milage,String enginetype) {
		super(model, brand, price);
		this.milage=milage;
		this.enginetype=enginetype;
		
		
		
	}

	@Override
	void getMilage() {
		System.out.println("Bike Milage : "+milage);
		
	}

	@Override
	void showType() {
		
		if(milage<35){
			System.out.println("It's a super bike");
		}else {
			System.out.println("it's a normal bike");
		}
		
	}
	void  engineType() {
		System.out.println("Bike engine type is "+enginetype);
	}

}
