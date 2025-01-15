
public class NetBankingApplication extends PaymentApplication {

    public void makePayment(double ammount) {
    
    	System.out.println("Payment done by Net Banking"+ammount);
    }
    
    public void ChekingInfo(String password)
    {
    	System.out.println("Password: "+password);
    }
}
