package com.anisha.polymorphism.methods;

// Compile Time Polymorphism
public class CompileTimePloymorphism {

	public void makePayment() {
		System.out.println("calling default");
	}
	public void makePayment(String paymentName) {
		System.out.println("calling(String )");
	}
	public String makePayment(double ammount)
	{
		System.out.println("Calling(double)");
		return "netbanking";
	}
	public void makePayment(int ammount) {
		System.out.println("calling(int)");
	}
	public static void main(String[] args) {
		CompileTimePloymorphism payment = new CompileTimePloymorphism();
		    payment.makePayment();
		    payment.makePayment("hello");
		    payment.makePayment(9999.0);
		    payment.makePayment(8888);
	}
}
