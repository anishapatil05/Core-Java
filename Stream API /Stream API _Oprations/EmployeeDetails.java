package com.anisha.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class EmployeeDetails {

	public static void main(String[] args) {

		ArrayList<Employee> allEmployees = infiOfAllEmp();

//		REQ : Print all employee Info having salary is grater than 55000
		List<Employee> employees = allEmployees // source of data
				.stream() // created stream
				.filter(e -> e.getSalary() >= 55000) // Intermideate Operation - get all Employee obj having salary is
														// 55000
				.toList(); // terminal operation - real result
		employees.forEach(e -> System.out.println(e));

//	    REQ : Get all Employee names whose age is grater than 30

		List<String> names = allEmployees // source of data
				.stream(). // created stream
				filter(e -> e.getAge() >= 25) // Intermideate Operation 1
				.map(e -> e.getName()) // Intermideate Operation 2
				.toList(); // terminal operation - real result

		for (String str : names) {
			System.out.println(str);
		}
		System.out.println();

//	    REQ : Get the count of feamle employees

		long femaleCount = allEmployees.stream().filter(e -> e.getGender() == 'F').count();
		System.out.println("Feamle count " + femaleCount);
		System.out.println();

//	    REQ : Get all employees information who is joing at year after 2015
		List<Employee> employee = allEmployees.stream().filter(e -> e.getJoiningYear() > 2015).toList();
		System.out.println(employee);
		System.out.println();

//	    REQ : Get all employees information who is joing at year before 2015

		List<Employee> empWhoJoinBefor2015 = allEmployees.stream().filter(e -> e.getJoiningYear() < 2015).toList();
		System.out.println(empWhoJoinBefor2015);
		System.out.println();

//	    REQ :  Get the count of male employees
		long maleCount = allEmployees.stream().filter(e -> e.getGender() == 'M').count();
		System.out.println("Male count " + maleCount);
		System.out.println();

//	 REQ : get count of employees who joined before 2017

		long employeeCount = allEmployees.stream().filter(e -> e.getJoiningYear() < 2017).count();
		System.out.println("Employee Count who join before 2017 " + employeeCount);
		System.out.println();

//        REQ : to get max salary employee from list
         Optional<Employee> maxSalry = allEmployees.stream()

		.max(new MyComp());
         System.out.println("Maximum salary  Employee deatils is " + maxSalry);

}
	

	public static ArrayList<Employee> infiOfAllEmp() {

		ArrayList<Employee> info = new ArrayList<>();
		info.add(new Employee("Anisha", 9990, 111, 21, 'F', 2016));
		info.add(new Employee("nisha", 10990, 222, 22, 'F', 2019));
		info.add(new Employee("Arun", 10000, 333, 22, 'M', 2018));
		info.add(new Employee("Avinash", 19990, 444, 25, 'M', 2019));
		info.add(new Employee("Avntika", 9000, 555, 23, 'F', 2016));
		info.add(new Employee("Anuuuu", 45990, 666, 28, 'F', 2011));
		info.add(new Employee("Abhi", 99000, 777, 29, 'M', 2012));
		info.add(new Employee("naval", 94567, 888, 28, 'M', 2019));
		info.add(new Employee("neha", 79990, 999, 22, 'F', 2011));

		return info;
	}

}
class MyComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.getSalary() == o2.getSalary()) {
			return 0;
		} else if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}

	}

}

