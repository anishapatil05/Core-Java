package com.anisha.eceptionhandling.trycatch.blocks;

//Opration 2:  Eceptions are handeled by indiudal try-Catch blocks
public class Demo2 {

	public static void main(String[] args) {

//		Opration 1: Arithmatic Eception
		try {
			int a = 10;
			int b = 10;

			double result = a / b;
			System.out.println("Division is: " + result);
		} catch (ArithmeticException ar) {
			System.out.println("Catch block of ArithmeticException");
			String reason = ar.getMessage();
			System.out.println(reason);
			System.out.println("Cant divide zero");
		}

		try {
			String name = null;
			System.out.println(name.toLowerCase());

		} catch (NullPointerException e) {
			System.out.println("Catch block of (NullPointerException");
			String reason = e.getMessage();
			System.out.println(reason);
			System.out.println("The value of name should be not a null ");
		}

		try {
			int[] numbers = { 6, 3, 2, 1, 4 };
			System.out.println(numbers[9]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch block of ArrayIndexOutOfBoundsException");
			String reason = e.getMessage();
			System.out.println(reason);
		}

		System.out.println("End of try-catch blocks");
	}

}
