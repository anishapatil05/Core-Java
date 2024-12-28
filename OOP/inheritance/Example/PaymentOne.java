package inheritance;

import java.util.*;

// Base Class 
public class PaymentOne {
	double avaBalance = 5000;
	double currentBalance;

	public void netBanking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your User Name: ");
		String UserName = sc.next();

		System.out.println("Enter your Password");
		String Password = sc.next();

		if (Password.length() == 4) {
			System.out.println("enter your current balance ");
			double currentBalance = sc.nextDouble();
			if (avaBalance > currentBalance) {
				System.out.println("Your payment is Successfull, visit again...");
			} else {
				System.out.println("transaction failed");
			}
//			informatiion available -> check balance -> payment
//			information ava -> low balance -> payment failed
//			inf wrong -> payment failed

		}
	}

	public static void main(String[] args) {

	}

}
