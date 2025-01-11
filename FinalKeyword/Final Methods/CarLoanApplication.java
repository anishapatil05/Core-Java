package com.anisha.polymorphism.methods;

// Child class: CarLoanApplication
// Example of Final method 
public class CarLoanApplication extends LoanApplication {

//	public void calculateEMIValue(double ammount,int months,double rate)
//	{
//		int N = 12;
//		System.out.println("Calculation of Loan from LOANAPPLICATION ");
//		double EMI = (months * rate*Math.pow(1+rate,N))/(Math.pow(1+rate, N)-1);
//		System.out.println("Your EMI ammoun is: "+EMI);
//	}

//	Override method
	public void loanDetailsDocuments() {
		System.out.println(" CarLoanApplication: Adhaar Card , PAN Card, Voter ID Card, Driving License");
	}

}
