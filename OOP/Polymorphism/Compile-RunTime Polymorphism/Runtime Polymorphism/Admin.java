
public class Admin {

	public static void main(String[] args) {
		System.out.println("****Runtime Polymorphism: Super & sub classes***");
//		Overriden methods
		PaymentApplication payment = new NetBankingApplication();
		payment.makePayment(7777, "Net Banking");

		payment = new CreditCardPayment();
		payment.makePayment(8888, "Credit card");

		payment = new UPIPayment();
		payment.makePayment(7654, "UPI");

//	      Non overriden method of Parent class : Compile Success
		payment.getDetails("anisha", 1234564321l);

		/*
		 * Non overriden method of child class : Compile time error
		 * payment.CreditCardCheking(123,11223454321l); This can be achive in the
		 * follwing way
		 */

		CreditCardPayment payment1 = new CreditCardPayment();
		payment1.CreditCardCheking(123, 11223454321l);
		payment1.getDetails("Abhishek", 1234567865l);

		System.out.println("****Runtiem Polymorphism : Interface Implements class****");

//	     Creating reference of Interface 
		Payments paymentoption = new PaymentApplication();

//	     parent class
		paymentoption.makePayment(89, "offline");

//	     creating obj of child classes CreditCardPayment();
		paymentoption = new CreditCardPayment();
		paymentoption.makePayment(555, "credit card");

//	     creating obj of child classes NetBankingApplication();
		paymentoption = new NetBankingApplication();
		paymentoption.makePayment(595, "NetBanking");

//	     creating obj of child classes  UPIPayment();
		paymentoption = new UPIPayment();
		paymentoption.makePayment(456, "UPI");

	}

}
