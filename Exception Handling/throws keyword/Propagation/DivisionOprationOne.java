package com.anisha.eception.throwkeyword;

public class DivisionOprationOne {

	public static void division(int a, int b) throws Exception {
		double result = a / b;
		System.out.println(result);

	}

//	Handling Exception by try-catch 
	public static void division2() {
		try {
			division(2, 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	// Here main() propagating exception to next level : JVM
	public static void main(String[] args) throws Exception {
//		calling   division2();
		division2();

//	    calling division()
		division(7, 9);

	}

}
