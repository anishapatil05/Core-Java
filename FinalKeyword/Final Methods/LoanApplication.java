package com.anisha.polymorphism.methods;
import java.util.*;
// Fianl methods : Preventing Overriding
// Parent class : LoanApplication
public class LoanApplication {

	public final void calculateEMIValue(double ammount,int months,double rate)
	{
		int N = 12;
		System.out.println("Calculation of Loan from LOANAPPLICATION ");
		double EMI = (months * rate*Math.pow(1+rate,N))/(Math.pow(1+rate, N)-1);
		System.out.println("Your EMI ammoun is: "+EMI);
	}
	
	public void loanDetailsOfDocuments()
	{
		System.out.println("Adhaar Card , PAN Card, Income Proof");
	}
}
