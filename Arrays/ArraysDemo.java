package com.java.arrays;

/*How to initialize an array: 1. Array Literal
                              2. Array initialization  */
public class ArraysDemo {

	public static void main(String[] args) {
//		1. Array Literal
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

//		getting value from array at index 4
		int value = num[4];
		System.out.println(value);

//		putting value at index 7 
		System.out.println("7th index before value putting: " + num[7]);
		num[7] = 10;
		System.out.println("7th index after value putting: " + num[7]);

//		finding length of an array
		System.out.println("the length of an array is: " + num.length);

//		Printing all values in the array
		System.out.print("{");
		for (int i = 0; i <= num.length - 1; i++) {
			System.out.print(num[i]);
			if (i != num.length - 1)
				System.out.print(",");
		}
		System.out.println("}");

//		Printing all values in the array in the reverse mannner
		System.out.print("{");
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i]);
			if (i != 0)
				System.out.print(",");
		}
		System.out.println("}");

	}

}
