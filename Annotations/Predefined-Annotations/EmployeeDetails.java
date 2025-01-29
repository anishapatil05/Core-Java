package com.anisha.annotations.predifined;

public class EmployeeDetails extends Employee {

//	Predefined Annotations
	@Override
	public void salary() {
		System.out.println("Salary is According to Devlopment class :EmployeeDetails  ");
	}

	public static void main(String[] args) {
		EmployeeDetails employee = new EmployeeDetails();
		employee.salary();
		System.out.println(employee.name());
	}

}
