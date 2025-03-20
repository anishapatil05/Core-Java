package com.anisha.grabagecollector.nonprmex;

public class Employee {

	public void finalize() {
		System.out.println("Object destroyed");
	}
}
