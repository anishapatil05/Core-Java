package com.anisha.polymorphism.methods;

// child class : HomeLoanApplication 
//Example of Final method 
public class HomeLoanApplication extends LoanApplication {
	
//	@Override method
	public void loanDetailsDocuments()
	{
		System.out.println(" HomeLoanApplication : Adhaar Card , PAN Card, Voter ID Card, Rent Aggriment");
	}
	

}
