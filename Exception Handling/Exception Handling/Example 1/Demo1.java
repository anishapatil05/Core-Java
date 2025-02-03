package com.anisha.eceptionhandling.trycatch.blocks;

// Opration 1: Multiple Exceptions using one try bleck & multiple catch blocks
public class Demo1 {

	public static void main(String[] args) {
		try {
			int x = 10;
			int b = 20;

			double result = x / b;
			System.out.println(result);

//		   If exception come here then rest of the logic in the try block never executes 
			String name = "ANU";
			System.out.println(name.toLowerCase());

			int arr[] = { 78, 90, 76, 54, 2 };
			System.out.println(arr[8]);
		} catch (ArithmeticException e) {
			String reason = e.getMessage();
			System.out.println(reason);
		} catch (NullPointerException e) {
			String reason = e.getMessage();
			System.out.println(reason);
		} catch (ArrayIndexOutOfBoundsException e) {
			String reason = e.getMessage();
			System.out.println(reason);
		}
		System.out.println("end of try-catch blocks");

	}

}
