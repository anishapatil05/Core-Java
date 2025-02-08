package com.anisha.userdifined.exceptiontype;

import java.util.Scanner;

public class VotingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("You are eligible");
		} else {

			try {
				throw new InvalidAgeException("You are not Eligible");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}

		}

	}

}
