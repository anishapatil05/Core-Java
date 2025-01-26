package com.anisha.staticdefault.methods;

public class Honda implements Vehical {
	
//	Abstarct to Concrete methods
	public void printCarCompany(String name) {
		System.out.println("Car Company: "+name);
	}
	
	public void fuelType(String fuelType) {
		if(fuelType == "Petrol")
		{
			System.out.println("Price of Petrol: 100 RS");
		}else if(fuelType == "Diesel")
		{
			System.out.println("Price of Diesel: 300 Rs");
		}
		else if(fuelType == "CNG")
		{
			System.out.println("Price of CNG: 91.50 Rs");
		}else {
			System.out.println("Choose correct option");
		}
		Vehical.serviceInterval();
		carFeatures(3000.8);
	}


}
