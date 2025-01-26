package com.anisha.staticdefault.methods;

public class Toyota implements Vehical {
	
//	Concrete method
	@Override
	public void printCarCompany(String name) {
		System.out.println("Car Company: "+name);
	}
	
	
//	Concrete method
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
		
//		calling static method
		Vehical.serviceInterval();
	
	}
//	Overriden method
	public double carFeatures(double rate)
	{
		System.out.println("High Speed of Toyota");
		System.out.println("Your rate is: "+ rate );
		System.out.println("Comfortable drivining of toyto & also some extara features...!!");
		double value = rate+ 5000;
	   return value;
	}
	
	

}

