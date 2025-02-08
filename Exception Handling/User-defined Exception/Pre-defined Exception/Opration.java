package com.anisha.exception.throwKeyword;

// Usage of "throw" keyword
public class Opration {

	public static void main(String[] args) {
		try {
			division(9, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			stringOprations(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void division(int a, int b) throws Exception  {
		if (b == 0) {
			throw new Exception("Invalid value of b...Cant't divide by 0 to any value");

		} else {
			double res = a / b;
			System.out.println(res);
		}
	}

	public static void stringOprations(String value) throws Exception {
		if (value == null) {
			throw new Exception("Value Can not be null...Please enter correct String");
		} else {
			System.out.println(value.toLowerCase());
		}
	}

}
