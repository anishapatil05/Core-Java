package com.anisha.exception.finallykeyword;

public class FinallykeywordDemo {

//	Finally block will not be excuted in 2 cases 

	public static void main(String[] args) {

//		Case 1: the control of exception is not enterd in try block
		System.out.println(10 / 0);

		try {
			System.out.println("try-block");
		} catch (ArithmeticException e) {
			System.out.println("catch-block");
		} finally {
			System.out.println("finally block");
		}

	}

}
