package com.anisha.staticdefault.methods;

public class ICICI implements BankApplication {
	
//	concrete method1
	public void bankName(String name) {
		System.out.println("Bank name: "+name);
	}
	
//	concrete method2
	public void getLoan(String loanType) {
		System.out.println("***Loan Types***");
		if(loanType == "Car Loan")
		{
			System.out.println("rate of interest is: 5%");
		}
		else if(loanType =="Home loan")
		{
			System.out.println("rate os interest is 10%");
		}
		else if(loanType =="Personal loan") {
			System.out.println("rate os interest is 19%");
		}
		else if(loanType == "Educational loan")
		{
			System.out.println("rate os interest is 2%");
		}
		
		BankApplication.guidlines();
	}
	
//	default method
	public double EMIvalueCal(int months,double ammount,double roi) {
		double EMI = months * ammount * roi;
		System.out.println("Extar fees for EMI: 5000");
		return EMI+5000;		
	}

}
