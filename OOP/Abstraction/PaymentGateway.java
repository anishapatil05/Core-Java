//  Interface : PaymentGateway
package inheritance;

public interface PaymentGateway {

//	abstract methods
	public void processPayment(Double BaseAmmount, String paymentM, double taxrate);

//	abstarct method
	public void verifyTransaction(String trascationID, double paymentAmmount);

//	abstarct method

	public void refundPayment(String reason);
}
