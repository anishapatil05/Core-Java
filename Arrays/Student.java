package com.java.arrays;

// Array initantiaton non-primitive data-type 
// instantiate the array of object..
public class Student {
//	definig instance variable
	int id;
	String name;
	double salray;
	

	public static void main(String[] args) {
//		classname(datatype) obj = 5 value to be stored in Student class
		
//		memory allocated
		Student[] student = new Student[5];
		
//		definig default values to instance var
		student[1] = new Student();
		
		Student s = student[1];
//		System.out.println(s);
//		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.salray);
//		
	   student[0] = new Student();
		
		Student s1 = student[0];
//		System.out.println(s1);
		
//		Assigning value at index 0
		System.out.println(s1.id=2);
		System.out.println(s1.name="anisha");
		System.out.println(s1.salray);
		
//		pointing to the s2 object same as the s1 object
		Student s2 = student[1];
	
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.salray);

	}

}
