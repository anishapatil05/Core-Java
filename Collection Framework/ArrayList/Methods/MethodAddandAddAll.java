package com.anisha.collectionfw.arrayList.demo;

import java.util.ArrayList;

public class MethodAddandAddAll {

	public static void main(String[] args) {

//		Approach 1: by Constructor : adding only one collection to another

		Student s1 = new Student("Neha", 8);
		Student s2 = new Student("Shreya", 9);

		ArrayList<Student> student = new ArrayList<>();
		student.add(s2); // ("Shreya",9);

		ArrayList<Student> student2 = new ArrayList<Student>(student);
		student2.add(s1); // ("Neha",8);

		for (Student stu : student2) {
			System.out.println(stu.sid + " " + stu.sname); // ("Neha",8);("Shreya",9);
		}

		System.out.println();
//		Approach 2: by addAll() : aading more than one collection to on collection
		Employee e1 = new Employee("Anisha", 111);
		Employee e2 = new Employee("Nisha", 222);
		ArrayList<Employee> employee = new ArrayList<>();

		employee.add(e1);
		employee.add(e2);

		ArrayList<Employee> employee2 = new ArrayList<>();
		employee2.add(new Employee("Shreyash", 333));

//		  REQURIMENT : aading employee & employee2 in employee3
		ArrayList<Employee> employee3 = new ArrayList<>();
		employee3.addAll(employee); // ("Anisha", 111); ("Nisha", 222),
		employee3.addAll(employee2); // ("Shreyash", 333

//			 Adding onle one object 
		employee3.add(new Employee("Abhi", 6)); // ("Abhi", 6)

		for (Employee emp : employee3) {
			System.out.println(emp.eid + " " + emp.ename);
		}

	}

}
