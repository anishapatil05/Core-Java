package com.anisha.collectionfw.setInterface.nonprimdata;

import java.util.HashSet;

public class StudentDetails {

	public static void main(String[] args) {
	
		Student s1 = new Student("Anisha", 111, 90);
		Student s2 = new Student("nisha", 222, 100);
		Student s3 = new Student("neha", 333, 80);
		Student s4 = new Student("Anisha", 111, 90);
		Student s5 = new Student("Ankita", 555, 100);
		
		HashSet<Student> students = new HashSet<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		
		System.out.println(students.size());
		
		for(Student s : students) {
			System.out.println(s.getName()+" "+s.getId()+" "+s.getMarks());
		}
		

	}

}
