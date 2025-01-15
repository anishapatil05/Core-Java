
// child class UPIPayment
public class UPIPayment extends PaymentApplication {
	
	 public void makePayment(double ammount) {
		    
	    	System.out.println("Payment done by UPI"+ammount);
	    }
	 
	 public void CheckInfo(long UPINum) {
		 System.out.println("UPI Number: "+UPINum);
	 }

}
