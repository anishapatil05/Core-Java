package com.anisha.eception;

//Example of Exceptions
public class Oprations {

	public static void main(String[] args) {
		System.out.println("Starting of main method");
		int a=9;
		int b=0;
		
//		It gives ArithmaticException
		double res = a/b;
		
		int[] values = {7,89,9};
		
		// ArrayIndexOutOfBoundException
		System.out.println(values[9]);
		System.out.println(res);
		
		System.out.println("End of main method");

	}

}
