
// child class UPIPayment
public class UPIPayment extends PaymentApplication {

//  Overriden method
	public void makePayment(double ammount, String type) {

		System.out.println("Payment done by UPI Application");
	}

//		normal/concrete method
	public void CheckInfo(long UPINum) {
		System.out.println("UPI Number: " + UPINum);
	}

}
