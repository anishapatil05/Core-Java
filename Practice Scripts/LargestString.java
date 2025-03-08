package com.anisha.practiceex;

// Finding largest String in array
public class LargestString {

	public static void main(String[] args) {

		String[] str = { "apple", "banana", "mango", "starfruit" };

		String largest = str[0];

		for (int i = 0; i < str.length; i++) {
			if (largest.length() < str[i].length()) {
				largest = str[i];
			}
		}
		System.out.println("Largest String is " + largest);

	}

}
