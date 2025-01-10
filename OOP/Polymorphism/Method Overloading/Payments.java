package com.anisha.polymorphism.methods;

import java.util.*;

public class Payments {
	/*
	 * Example of Polymorphism : Method Overloading Different types of payments : 1.
	 * DEBIT CARD 2.UPI 3.WALLET BALANCE
	 */

	double balance = 4000;

	public void makePayment(String date, String CardNum, int CVV, double ammount) {
		System.out.println("********paymet type: Debit Card*********");

		System.out.println(" your Expiray date MM/DD : " + date);

		String dateparts[] = date.split("/");
//		dateparts[0] ="16"
//		dateparts[1] ="24"

		if (dateparts.length == 2) {
			int month = Integer.parseInt(dateparts[0]);
			int year = Integer.parseInt(dateparts[1]);

			if (month >= 1 && month <= 12 && year >= 21 && year <= 25) {

				System.out.println("Your DEBIT CARD is valid!! ,  your CARD NUMBER");

				if (CardNum.matches("\\d{12}")) {
					System.out.println("Your card number is valid: " + CardNum + "Enter your CVV: " + CVV);

					String CVV1 = String.valueOf(CVV);
					if (CVV1.matches("\\d{3}")) {
						System.out.println("Your Balance is: " + balance);
						if (ammount > balance) {
							System.out.println("INSUFFICIENT BALANCE!!");
						} else {
							balance -= ammount;
							System.out.println("TRANSCATION IS SUCCESSFULL");
							System.out.println("DO you want to check reamning balnace 1. YES , 2.NO");
							Scanner sc = new Scanner(System.in);
							int choise = sc.nextInt();

							if (choise == 1) {
								System.out.println("YOUR REAMING BALANCE IS: " + balance);
							} else if (choise == 2) {
								System.out.println("Thank You");
							} else {
								System.out.println("enter correct choise");
							}
							sc.close();
						}
					}

					else {
						System.out.println("ENTER CORRECT CVV NUMBER !!!!");
					}
				} else {
					System.out.println("INVALID CARD NUMBER");
				}
			} else {
				System.out.println("YOUR CARD IS NOT VALID !!!");
			}

		} else {
			System.out.println("Enter numeric number");
		}
	}

	public void makepayments(String UPIId, double ammount) {
		System.out.println("******Payment type: UPI******");
		System.out.println("Your UPIId is: " + UPIId);
		balance -= ammount;
		System.out.println("Your reaming ammount is: " + balance);
	}

	public void makepayments(double walletbalance, double ammount) {
		System.out.println("********Payment Type********");
		Scanner sc = new Scanner(System.in);
		walletbalance = balance;
		System.out.println("Your wallet balance is: " + walletbalance);
		walletbalance -= ammount;
		System.out.println("Your reaminig ammount is: " + walletbalance);

	}

	public static void main(String[] args) {
		Payments obj = new Payments();
		obj.makePayment("2/24", "123456789012", 123, 200);
		obj.makepayments(800, 50);
		obj.makepayments("anu@123", 90);
	}

}
