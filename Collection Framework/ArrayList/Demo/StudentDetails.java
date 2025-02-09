package com.anisha.collectionfw.demo;

import java.util.ArrayList;

public class StudentDetails {
//	Adv :  Dynamic Size memory allcation by threshold percentage 
	public static void main(String[] args) {

//		 ArrayList is store any type of data : NO DATATYPE SAFTY

//		ArrayList<Class-Name> <AL-Name> = new ArrayList<>();
		ArrayList student = new ArrayList();

		student.add("Anisha"); // String
		student.add(31); // int
		student.add(45000.4); // double
		student.add('F'); // character
		student.add(new ArrayIndexOutOfBoundsException()); // Exception class object

//		Calling Student Class
		Student s1 = new Student();
		student.add(s1); // Object of Student class

//		Array : DATATYPE SAFTY
		int[] arr = new int[2];
		arr[0] = 9;
		arr[1] = 8;

//		So the reason of Safty Collect FW introduces concept of Generics : DATATYPE SAFTY
		ArrayList<String> names = new ArrayList<>();

//		It allows us only store String type data otherwise produce Compile time error
		names.add("Anisha");
		names.add("Abhishek");
		names.add("Sheyash");

//		Creating ArrayList For Integer type
		ArrayList<Integer> Id = new ArrayList<Integer>();
		Id.add(8);
		Id.add(9);

	}

}
