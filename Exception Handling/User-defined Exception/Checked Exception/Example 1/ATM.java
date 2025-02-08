package com.anisha.userdifined.exceptiontype;

import java.util.Scanner;


public class ATM {

	double balance = 6000;
	double bankCriteriyaOfAmmount = 100000;

	public static void main(String[] args) {

		ATM oprations = new ATM();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choise: 1.Debit, 2.Credit, 3.checking blanace");
		String choise = sc.next();

		switch (choise) {
		case "debit": {

			try {
				oprations.debited(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
			break;

		case "Credit": {
			try {
				oprations.credited(800000);
			} catch (DataNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
			break;

		case "Cheking Balance": {
			oprations.checkBalnce();
		}
			break;
		default: {
			System.out.println("Enter correct choise ");
		}

		}

	}

//	   logic for DEBIT AMMOUNT
	public void debited(double ammount) throws DataNotFoundException {
		if (ammount > balance) {
			throw new DataNotFoundException("Your Bank Balance is Insufficent ...please enter under the balnace");
		} else {
			balance -= ammount;
			System.out.println("Your ammount is debited: " + ammount);

			Scanner sc = new Scanner(System.in);
			System.out.println("If you want check reaminig balance: 1.Yes , 2.NO ");
			int choise = sc.nextInt();

			if (choise == 1) {
				System.out.println("Your Reaming balance is: " + balance);

			} else {
				System.out.println("Thank You");
			}
			sc.close();

		}

	}

//   logic for CREDIT AMMOUNT
	public void credited(double ammount) throws DataNotFoundException {
		if (bankCriteriyaOfAmmount < ammount) {
			throw new DataNotFoundException(
					"The bank critery of ammount is 1 Lack only for regular accounter!!!...If you want to increse that then take primium of balance..");
		} else {
			balance += ammount;
			System.out.println("Your ammount is Credited: " + ammount);
			Scanner sc = new Scanner(System.in);
			System.out.println("If you want check your balance then enter : 1.Yes , 2.NO ");
			int choise = sc.nextInt();

			if (choise == 1) {
				System.out.println("Your balance is after credition of ammount: " + balance);

			} else {
				System.out.println("Thank You");
			}
			sc.close();

		}

	}

//	logic for only checking balance
	public void checkBalnce() {
		System.out.println("In your account balance is: " + balance);
	}

}
