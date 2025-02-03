package com.anisha.eceptionhandling.trycatch.blocks;

// Opration 3 : If same Exception type is not found JVM then it gives 2nd Priority to Parent
public class Demo3 {

	public static void main(String[] args) {
		try {

//			Test case 1 : Arithmetic Exception
			int a = 10;
			int b = 0;

			double result = a / b;
			System.out.println("Division is: " + result);

			/* IMP : here ones exception occoures in Test case 1 then it find catch block
			and excutes that and never comes try block again..*/ 

//			Test case 2 : NullPointerException

			String name = null;
			System.out.println(name.toLowerCase());

//			Test case 3 : ArrayIndexOutOfBoundsException
			int arr[] = { 9, 0, 76, 5, 4 };
			System.out.println(arr[9]);

		}

		// Parent Exception Type is Ava to all Eceptions
		catch (Exception e) {
			System.out.println("Catch block of Exception");
			String reason = e.getMessage();
			System.out.println(reason);

		}

	}

}
