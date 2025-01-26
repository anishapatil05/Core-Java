package com.anisha.staticdefault.methods;

public class FedralBank implements BankApplication {
	
//	concrete method1
	public void bankName(String name) {
		System.out.println("Bank name: "+name);
	}
	
//	concrete method2
	public void getLoan(String loanType) {
		System.out.println("***Loan Types***");
		if(loanType == "Car Loan")
		{
			System.out.println("rate of interest is: 15%");
//			calling default method
			double value = EMIvalueCal(4, 4444,15);
			System.out.println("Your EMI value becomes: "+value);
		}
		else if(loanType =="Home loan")
		{
			System.out.println("rate os interest is 10.9%");
			double value = EMIvalueCal(2, 444,10.9);
			System.out.println("Your EMI value becomes: "+value);
		}
		else if(loanType =="Personal loan") {
			System.out.println("rate os interest is 18%");
			double value = EMIvalueCal(3, 4454,18);
			System.out.println("Your EMI value becomes: "+value);
		}
		else if(loanType == "Educational loan")
		{
			System.out.println("rate os interest is 4%");
			double value = EMIvalueCal(1, 4444,4);
			System.out.println("Your EMI value becomes: "+value);
		}
	
// calling static method: interfacename.method_name();
		BankApplication.guidlines();
	}
	


}
