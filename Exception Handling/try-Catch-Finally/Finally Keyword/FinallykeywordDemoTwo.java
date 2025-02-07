package com.anisha.exception.finallykeyword;

public class FinallykeywordDemoTwo {

//	Finally block will not be excuted in 2 cases 
	public static void main(String[] args) {
//		Case 2 : System.exit(0);   -> the JVM terminates

		try {

			System.out.println("try block");
			System.exit(0);

		} catch (ArithmeticException e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}

	}

}
