package com.anisha.collectionfw.arrayList.demo;

import java.util.ArrayList;
import java.util.Collections;

// swap() & sublist methods
public class Test4 {

	public static void main(String[] args) {

		Employee e1 = new Employee("Anisha", 111);
		Employee e2 = new Employee("Nisha", 222);
		Employee e3 = new Employee("Apeksha", 333);
		Employee e4 = new Employee("Neha", 444);

		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);

//		sublist()
		ArrayList<Employee> employee2 = new ArrayList<>(employee.subList(0, 3));

		System.out.println("before swapping");
		for (Employee e : employee2) {
			System.out.println(e.eid + " " + e.ename);
		}

//		swap()
		Collections.swap(employee2, 0, 2);
		System.out.println("After swapping");
		for (Employee e : employee2) {
			System.out.println(e.eid + " " + e.ename);
		}

	}

}
