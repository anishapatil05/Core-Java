package com.anisha.practiceex;

import java.util.Scanner;

// Check String is Palindrom or not 
public class PalindromNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.next();

		sc.close();
		boolean isPaindrom = true; // we assume initially palindrom

		int n = str.length();
		for (int i = 0; i <= n / 2; i++) {

			if (str.charAt(i) != str.charAt(n - i - 1)) {

				isPaindrom = false;
				break;
			}

		}

		if (isPaindrom) {
			System.out.println(" Palindrom");
		} else {
			System.out.println("not Paildrom");
		}

	}

}
