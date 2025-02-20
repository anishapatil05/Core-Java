package com.anisha.collectionfw.setInterface.LinkedhashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e1 = new Employee("Anisha", 111);
		Employee e2 = new Employee("Saniya", 222);
		Employee e3 = new Employee("niya", 333);
		Employee e4 = new Employee("priya", 444);

		LinkedHashSet<Employee> employees = new LinkedHashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		Iterator<Employee> itr = employees.iterator();

		while (itr.hasNext()) {
			Employee e = itr.next();
			if (e.id == 222) {
				itr.remove();
			}
			if (e.name.equals("niya")) {
				itr.remove();
			}
		}

		for (Employee e : employees) {
			System.out.println(e.id + " " + e.name);
		}

	}

}
