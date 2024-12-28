package inheritance;

import java.util.*;

public class PaymentThree extends PaymentTwo {

	public void creditCardPayment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your credit card number");
		String cardNum = sc.next();

		if (cardNum.length() == 16 && cardNum.matches("\\d+")) {
			System.out.println("Enter your Password");
			String password = sc.next();

			if (password.length() == 4 && password.matches("\\d+")) {
//				informatiion available -> check balance -> payment
//				information ava -> low balance -> payment failed
//				inf wrong -> payment failed
				System.out.println("your payment is successfull");
			} else {
				System.out.println("Check your password again ....Something went wrong");
			}
		} else {
			System.out.println("your cardnum is invalid");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
