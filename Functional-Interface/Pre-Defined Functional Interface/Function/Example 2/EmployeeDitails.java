package com.anisha.predefinedfi.function;
import java.util.function.*;

public class EmployeeDitails {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Anisha", 111, 56000);

		Function<Employee, Double> sal = emp -> {
                      return emp.getSalary();
		};
		
//		Geeting salary from Employee Object
		System.out.println(sal.apply(emp1));
		
		
		
		Employee emp2 = new Employee("Sanika", 222, 90000);
		Function<Employee,Boolean> CheckingSalary = e ->{
			return e.getSalary()>= 50000;
		};
		
		boolean val = CheckingSalary.apply(emp2);
		System.out.println("Salary is grater than 50000 "+val);
		
		

	}

}
