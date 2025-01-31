package com.anisha.functional.Interface;

public class EmployeeDetails {

	public static void main(String[] args) {
//		Implementation of functional interface: Lambda Expression
		Employee employee = (String name) ->{
			System.out.println(name);
		};
		
		employee.printInfo("Anisha");
		
		Employee emp = name -> System.out.println("hello");
		emp.printInfo("sanu");

	}

}
