package com.anisha.collectionfw.userdefinedclass;

import java.util.ArrayList;

public class StudentDetails {

	public static void main(String[] args) {

		Student s1 = new Student("Anisha", 31, 500);
		Student s2 = new Student("Nisha", 32, 700);
		Student s3 = new Student("Apeksha", 30, 300);
		Student s4 = new Student("Anuu", 54, 200);
		Student s5 = new Student("Abhishek", 1, 600);
		Student s6 = new Student("Shreyash", 3, 300);

		ArrayList<Student> studentDetails = new ArrayList<>();
		studentDetails.add(s1);
		studentDetails.add(s2);
		studentDetails.add(s3);
		studentDetails.add(s4);
		studentDetails.add(s5);
		studentDetails.add(s6);

		for (Student s : studentDetails) {
			System.out.println(s);

		}

		System.out.println();
		System.out.println(s3.getName());
		System.out.println(s5.getId());

		System.out.println(studentDetails.contains(s3));
		System.out.println(studentDetails.size()); // 6

//		remove s2
//		studentDetails.remove(1);
//		System.out.println(studentDetails);

		studentDetails.remove(s5);
		System.out.println(studentDetails);

//		added at 0th index
		studentDetails.add(0, new Student("Abhi", 78, 800));
		System.out.println(studentDetails);

		System.out.println();
		System.out.println(studentDetails.getFirst());

		System.out.println();
//		Student lastStudent = studentDetails.getLast();
//		System.out.println(lastStudent);         

		System.out.println(studentDetails.get(studentDetails.size() - 1));

		studentDetails.clear();

		if (studentDetails.isEmpty()) {
			System.out.println("ArrayList is empty");
		}

	}

}
