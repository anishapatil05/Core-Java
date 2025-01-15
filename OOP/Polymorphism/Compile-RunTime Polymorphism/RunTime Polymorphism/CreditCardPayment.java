
// child class  CreditCardPayment 
public class CreditCardPayment extends PaymentApplication
{
    public void makePayment(double ammount) {
    
    	System.out.println("Payment done by Credit card"+ammount);
    }
    
    public void CreditCardCheking(int CVV, long cardNumber)
    {
    	System.out.println("CVV: "+CVV+" "+"Card Number: "+cardNumber);
    }

}
