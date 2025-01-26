package com.anisha.staticdefault.methods;

// vehical : Interface 
public interface Vehical {
	
//	Abstract method
	public void printCarCompany(String name);
	public void fuelType(String fuelType);
	
//	static method 
	public static void serviceInterval()
	{
		System.out.println(" Service Interval is 12 months ");
	}
	
//	default methods
	public default void carFeatures(Double rate)
	{
		System.out.println("High Speed");
		System.out.println("Your Servicing rate is: "+rate );
		System.out.println("Comfortable drivining");
	}

}
