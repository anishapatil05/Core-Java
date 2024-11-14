package com.java.arrays;

// Task 1 : Taking String array of names 
public class Assignment6 {

	public static void main(String[] args) {

		String[] names = { "Anisha", "Apeksha", "Shreyash", "Abhishek", "Sidhant", "Sanvi", "Shreya", "Arachana",
				"Kuber", "Chetan" };

//		Printing Last name of student
		String lastStudent = names[9];
		System.out.println("last student name: " + lastStudent);

//		Printing size of String array
		System.out.println(names.length);

//		Printing first name of student
		String firstStudent = names[0];
		System.out.println("last student name: " + firstStudent);

//		Printing all Persons name
		System.out.print("{");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
			if (i != names.length - 1)
				System.out.print(",");
		}
		System.out.print("}");

//		Printing all Persons name in reverse order
		System.out.print("{");
		for (int i = names.length - 1; i >= 0; i--) {
			System.out.print(names[i]);
			if (i != 0)
				System.out.print(",");
		}
		System.out.println("}");

//		Task 2:  Taking char array

		char[] characters = { 'A', 'B', 'C', 'D', 'E' };

//		printing random char
		char ch = characters[2];
		System.out.println(ch);

//		Priniting all char in the array
		System.out.print("{");
		for (int i = 0; i <= characters.length - 1; i++) {
			System.out.print(characters[i]);
			if (i != characters.length - 1) {
				System.out.print(",");
			}

		}
		System.out.println("}");

//		Task 3: Reverse a number alternamtive way
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
		reversenum(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

	public static void reversenum(int numbers[]) {
		int first = 0;
		int last = numbers.length - 1;
		while (first < last) {
			int temp = numbers[last];
			numbers[last] = numbers[first];
			numbers[first] = temp;

			first++;
			last--;
		}

	}

}
