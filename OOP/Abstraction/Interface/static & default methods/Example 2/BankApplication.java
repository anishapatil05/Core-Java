package com.anisha.staticdefault.methods;

public interface BankApplication {
	
//	abstarct methods
	public void bankName(String name);
	public void getLoan(String loanType);
	
//	default method
	public default double EMIvalueCal(int months,double ammount,double roi)
	{
		double EMIvalue =  months * ammount * roi;
		return EMIvalue;
	}
	
//	static method 
	public static void guidlines()
	{
		System.out.println("1.Apply 25% loan on home");
	}
	


}
