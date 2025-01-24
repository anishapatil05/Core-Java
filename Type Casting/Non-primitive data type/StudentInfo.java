package com.anisha.typecasting;

public class StudentInfo {
	public static void main(String[] args) {
//		Up Casting/implicit/widening type casting 
		System.out.println("***Up casting: non-primitive ***");
		Student student = new Student1();
		System.out.println(student.getClass());

//  		Down Casting/Explicit/Narrowing type casting 
		System.out.println("***Down casting: non-primitive ***");

//    	  parent class reference is holds always child class obj : Dynami Ploymorphism
		Student1 s1 = new Student1();
		Student2 student2 = new Student2();

		Student s2 = student2; // s1 : child class reference
		printInfo(s2);

	}

	public static void printInfo(Student student) {
//    	  Down Casting : child real object converting into it's own data type from parent reference 
		if (student instanceof Student1) {
			Student1 student1 = (Student1) student;
			System.out.println(student1.getClass());
		} else if (student instanceof Student2) {
			Student2 student2 = (Student2) student;
			System.out.println(student2.getClass());
		} else {
			System.out.println("choose correct option...");
		}

	}
}
