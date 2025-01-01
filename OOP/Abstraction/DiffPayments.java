package inheritance;

import java.util.*;

public class DiffPayments implements PaymentGateway {
	double originalAmmount = 50000;

//	concreate method : implements PaymentGateway interface
	public void processPayment(Double BaseAmmount, String paymentM, double taxrate) {
		System.out.println(paymentM);
		Scanner sc = new Scanner(System.in);
		double totalAmmount;

		totalAmmount = BaseAmmount * taxrate / 100;
		System.out.println("the total ammount is: " + totalAmmount);
	}

//	concreate method : implements PaymentGateway interface
	public void verifyTransaction(String trascationID, double paymentAmmount) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Your transcationID is: " + trascationID);

		if (trascationID.matches("\\d{12}")) {
			double difference = originalAmmount - paymentAmmount;
			System.out.println("remaning ammount: " + difference);
		}

	}

//	concreate method : implements PaymentGateway interface
	public void refundPayment(String reason) {
		System.out.println("refund ammount is: " + originalAmmount);
		System.out.println(reason);
	}

	public static void main(String[] args) {
		DiffPayments obj = new DiffPayments();
		obj.processPayment(1000.0, "google pay", 18);
		obj.verifyTransaction("123456789012", 100);
		obj.refundPayment("" + "no valid reason");

	}

}
