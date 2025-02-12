package com.anisha.collectionfw.userdefinedclass;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Demo obj = new Demo();
		System.out.println(obj.getStudentDetails());

//	Compile time error
//	 List<Student> objj = new HashSet();
	}

	public List<Student> getStudentDetails() {

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

		return studentDetails;
	}
}
