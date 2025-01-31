package com.anisha.functional.Interface2;

import java.util.*;

public class PaymentProcess {

	double priniciple = 5000;

	public static void main(String[] args) {
		PaymentProcess payment = new PaymentProcess();
		payment.paymentTypes();

	}

	public void paymentTypes() {
		System.out.println("Enter your choise : 1.UPI , 2.CreditCard, 3.DebitCard");
		Scanner sc = new Scanner(System.in);
		int choise = sc.nextInt();

		Payment selectPayment = null;
		switch (choise) {
		case 1:
			selectPayment = (ammount) -> {
				priniciple = priniciple - ammount;
				System.out.println("Payment is done by UPI: " + ammount);
			};

			break;
		case 2:
			selectPayment = (ammount) -> {
				priniciple = priniciple - ammount;
				System.out.println("Payment is done by Credit card: " + ammount);
			};

			break;
		case 3:
			selectPayment = (ammount) -> {
				priniciple = priniciple - ammount;
				System.out.println("Payment is done by DebitCard: " + ammount);
			};
			break;

		default:
			System.out.println("choose correct choise");

		}
		if (selectPayment != null) {
			selectPayment.paymentType(90);
			System.out.println("Want to check reaming balance 1.YES , 2.NO ");
			int option = sc.nextInt();
			if (option == 1)
				System.out.println("Your Reamning balance is: " + priniciple);
			else {
				System.out.println("Thank You");
			}

		}

	}

}
