package com.lumen.abs;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle= new Bike("Pulsar","Bajaj",10000,40,"180cc");
		vehicle.printDetails();
		vehicle.getMilage();
		vehicle.showType();
		Bike bike = (Bike) vehicle;
		bike.engineType();
		System.out.println();
		
		
		vehicle=new Car("Thar","Mahendra",20000,80);
		vehicle.printDetails();
		vehicle.getMilage();
		vehicle.showType();
		Car car=(Car)vehicle;
		car.showAccessories("Cat Cover","freshner","lights");
		
	}
	
	

}
