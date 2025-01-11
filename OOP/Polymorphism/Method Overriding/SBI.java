package com.anisha.polymorphism.methods;

// Example Of method overriding
public class SBI extends Bank {

//	Method Overriding 1
	public double getRateOfInterest() {
		System.out.println("Rate of interest of SBI Bank");
		return 9.9;
	}

// It's Own method
	public void getDetails() {
		System.out.println("bank name: SBI ");
	}

//	Method Overriding 3
	public double loanApplication(double ammount) {
		System.out.println("Apply for Loan from SBI bank");
		return ammount;
	}

//	Method Overriding 4
	public void accountDeatils() {
		System.out.println("Account Details like Opening or closing accounts & updateing accounts from SBI bank");
	}

	public static void main(String[] args) {
		SBI obj = new SBI();
		obj.getRateOfInterest();
		obj.getDetails();
		obj.loanApplication(7777);
		obj.accountDeatils();

//	 From a Bank Praent class
		Bank bank = new Bank();
		bank.accountDeatils();

	}

}
