package com.java.arrays;

/* Task : Sum of array values :{73434,324,35,45656,57,58,67,89,789,97,789789,57}
 * 1.Identify max value from an array :789789
 * 2.Identify min value from an array :35
 * 3.avg of array values
 * 4.Identify duplicate from an array
 */
public class Assignment7 {

	public static void main(String[] args) {

//	Sum of array values 
		int values[] = { 73434, 324, 35, 45656, 57, 58, 67, 89, 789, 97, 789789, 57 };
		int sum = 0;
		for (int i = 0; i <= values.length - 1; i++) {
			sum = sum + values[i];
		}
		System.out.println("sum is: " + sum);

//		Identify max value from an array
		int largest = Integer.MIN_VALUE;

		for (int i = 0; i <= values.length - 1; i++) {
			if (largest < values[i]) {
				largest = values[i];
			}
		}
		System.out.println("largest: " + largest);

//		Identify max value from an array
		int smallest = Integer.MAX_VALUE;

		for (int i = 0; i <= values.length - 1; i++) {
			if (smallest > values[i]) {
				smallest = values[i];
			}
		}
		System.out.println("Smallest: " + smallest);

//		avg of array values
		int avg = 0;
		int addition = 0;
		for (int i = 0; i <= values.length - 1; i++) {
			addition = addition + values[i];

		}
		int length = values.length;
		avg = addition / length;
		System.out.println("avg is: " + avg);

//		Identify duplicate from an array
		for (int i = 0; i <= values.length - 1; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] == values[j]) {
					System.out.println("Duplicate Found: " + values[i]);
				}
			}
		}
		
//		add 5% to all values 
		for (int i : values) {
			System.out.println(i + 5);
		}

	}

}
