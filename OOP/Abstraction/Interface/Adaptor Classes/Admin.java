package com.anisha.adaptorclasses;

import java.util.Scanner;

public class Admin extends BankApplication {
	double balance = 5000;

	public void credit(double ammount) {
		balance += ammount;
		System.out.println("thank you Your ammount is Credited: " + ammount);

		System.out.println("You have to check Balance: 1.YES , 2.NO");
		Scanner sc = new Scanner(System.in);
		int choise = sc.nextInt();

		if (choise == 1) {
			System.out.println("Your balance is: " + balance);
		} else {
			System.out.println("Thank you");
		}
	};

	public static void main(String[] args) {
		Admin oprcredit = new Admin();
		oprcredit.credit(90);
	}

}
