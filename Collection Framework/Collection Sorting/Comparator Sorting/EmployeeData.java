package com.anisha.collectionfw.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeData {

	public static void main(String[] args) {
		Employee e1 = new Employee("Anisha", 111);
		Employee e2 = new Employee("Nisha", 555);
		Employee e3 = new Employee("ratan", 666);
		Employee e4 = new Employee("neha", 333);

		ArrayList<Employee> employess = new ArrayList<>();
		employess.add(e1);
		employess.add(e2);
		employess.add(e3);
		employess.add(e4);

		Collections.sort(employess, new EmpIdComp());
//		Collections.sort(employess, new EmpNameComp());

		for (Employee emp : employess) {
			System.out.println(emp.id + " " + emp.name);
		}

	}

}
