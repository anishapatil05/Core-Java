package inheritance;

import java.util.*;

// Child class
public class PaymentTwo extends PaymentOne {

	public void debitCardPayment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your credit card number: ");
		String cardNum = sc.next();

		if (cardNum.length() == 16 && cardNum.matches("\\d+")) {

			System.out.println("Enter your CVV number: ");
			String CVV = sc.next();
			if (CVV.length() == 3 && CVV.matches("\\d+")) {
				System.out.println("Enter the Expirydate MM/YY");
				String date = sc.next();

				String[] arr = date.split("/");
				String month = arr[0];
				String year = arr[1];
				int mon = Integer.parseInt(month);
				int yer = Integer.parseInt(year);

				if (mon >= 1 && mon <= 12) {
					if (yer >= 24 && yer <= 31) {
						System.out.println("Payment sccessfull");
					} else {
						System.out.println("payment failed");
					}
				} else {
					System.out.println("invalid expiray date");
				}

			} else {
				System.out.println("your CVV number is wrong");
			}
		} else {
			System.out.println("cardNumber is wrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
