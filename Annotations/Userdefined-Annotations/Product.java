package com.anisha.annotations.userdefined;

// Creation of userdefined annotations
// Using : @Target & @RetentionPolicy
          

public class Product {

	// userdefined annotation
	@FirstAnnotation(value = 3,name="Anisha")
	public void product()
	{
		System.out.println("hii");
	}
}
