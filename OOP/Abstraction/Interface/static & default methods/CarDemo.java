package com.anisha.staticdefault.methods;

public class CarDemo {

	public static void main(String[] args) {

		Toyota car = new Toyota();
		car.printCarCompany("Toyota");
		car.fuelType("Diesel");
		car.carFeatures(6777.0);
		
		
		Honda bike = new Honda();
		bike.printCarCompany("Honda");
		bike.fuelType("Petrol");
		
		Vehical.serviceInterval();
		 
	}

}
