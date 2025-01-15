
public class Admin {

	public static void main(String[] args) {
		PaymentApplication payment = new NetBankingApplication();
	    payment.makePayment(7777);
	    
	    PaymentApplication payment1 = new CreditCardPayment();
	    payment1.makePayment(8888);
	    
	    PaymentApplication payment3 = new UPIPayment();
	    payment3.makePayment(7654);
	    
	    PaymentApplication payment4  = new PaymentApplication();
	    payment4.makePayment(99);
	    
	    

	}

}
