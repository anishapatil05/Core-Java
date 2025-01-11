package com.anisha.polymorphism.methods;

// Example of Method Overriding
public class Bank {

//	Method Overridien
	public double getRateOfInterest() {
		System.out.println("Rate of interest of Bank");
		return 7.9;
	}

//	Method Overridien

	public double loanApplication(double ammount) {
		System.out.println("Apply for Loan");
		return ammount;
	}

//	Method Overridien

	public void accountDeatils() {
		System.out.println("Account Details like Opening or closing accounts & updateing accounts");
	}
}
