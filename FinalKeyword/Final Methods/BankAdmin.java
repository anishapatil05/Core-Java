package com.anisha.polymorphism.methods;

public class BankAdmin {

	public static void main(String[] args) {
		CarLoanApplication carloan = new CarLoanApplication();
		carloan.calculateEMIValue(7777, 8, 1);
		carloan.loanDetailsDocuments();
		
		HomeLoanApplication homeloan = new HomeLoanApplication();
		homeloan.calculateEMIValue(9999, 4, 3);
		homeloan.loanDetailsDocuments();
	}
	

}
