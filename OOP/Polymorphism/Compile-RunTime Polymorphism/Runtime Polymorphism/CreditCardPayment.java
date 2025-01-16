
// child class  CreditCardPayment 
public class CreditCardPayment extends PaymentApplication {
//  Overriden method
	public void makePayment(double ammount, String type) {

		System.out.println("Payment done by Credit card");
	}

//	normal/concrete method
	public void CreditCardCheking(int CVV, long cardNumber) {
		System.out.println(" Sub class CreditCardPayment: CVV: " + CVV + " " + "Card Number: " + cardNumber);
	}

}
