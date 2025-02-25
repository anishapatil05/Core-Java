package com.anisha.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeDetails {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Shreya", 'F', 56660));
		employees.add(new Employee("Shreyash", 'M', 90000));
		employees.add(new Employee("Ketki", 'F', 66600));
		employees.add(new Employee("Abhishek", 'M', 58880));

//	  req : check given employee is Male or not and return name

		Predicate<Employee> isMale = emp -> emp.getGender() == 'M';

		Function<Employee, String> names = emp -> emp.getName();

		List<String> maleList = new ArrayList<>();

		for (Employee e : employees) {
			if (isMale.test(e)) {
				maleList.add(names.apply(e));
			}
		}

		System.out.println(maleList);

//		REQ : get avg salary of employeee

		Function<Employee, Integer> Avgsalary = e -> {

			int tot_sal = 0;

			for (Employee emp : employees) {
				tot_sal += emp.getSalary();
			}

			return tot_sal / employees.size();

		};

		System.out.println("Avrage salary of employee is: " + Avgsalary.apply(employees.get(0)));

//		REQ : get all female employees list from employee

		ArrayList<String> femaleList = new ArrayList<String>();

		Function<Employee, List<String>> femals = emp -> {

			for (Employee e : employees) {
				if (e.getGender() == 'F') {
					femaleList.add(e.getName());
				}
			}
			return femaleList;
		};

		System.out.println("Feamle List is " + femals.apply(employees.get(0)));
	}

}
