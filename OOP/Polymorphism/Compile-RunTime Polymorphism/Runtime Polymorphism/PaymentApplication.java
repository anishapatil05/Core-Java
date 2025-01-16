
// Runtime Polymorphism
public class PaymentApplication implements Payments {

//    Overriden method
	public void makePayment(double ammount, String type) {
		System.out.println(" PaymentApplication :making payment by different ways");
	}

//	normal/concrete method
	public void getDetails(String name, long passbooknumber) {
		System.out
				.println(" Super Class PaymentApplication :name: " + name + "," + "Passbook Number: " + passbooknumber);
	}

}
