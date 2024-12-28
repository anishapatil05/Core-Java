package inheritance;

import java.util.Scanner;

public class PaymentFour extends PaymentThree {

	double avaBalance = 5000;
	double currentBalance;

	public void UPIPayment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your UPI Number: ");
		String UPINum = sc.next();

		if (UPINum.length() == 12) {
			System.out.println("enter your current balance ");
			double currentBalance = sc.nextDouble();
			if (avaBalance > currentBalance) {
				avaBalance = avaBalance - currentBalance;
				System.out.println("Your payment is Successfull, & current ava balance is: " + avaBalance);

			} else {
				System.out.println("transaction failed");
			}
//			informatiion available -> check balance -> payment
//			information ava -> low balance -> payment failed
//			inf wrong -> payment failed

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
