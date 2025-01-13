package com.anisha.thiskeyword;

// usage of "this" keyword : refers in constructor call to another constructor using "this"
public class EmployeeInfo {
	String name;
	double salary;
	String work;

	public EmployeeInfo(String name, double salary, String work) {

		System.out.println("three parametrized constructor");
		this.name = name;
		this.salary = salary;
		this.work = work;
		System.out.println(this.name);
		System.out.println(this.salary);
		System.out.println(this.work);
	}

	public EmployeeInfo(int leaveCount) {
		this("anu", 2222, "dev");
		System.out.println("1 parametrized constructor");
	}

	public EmployeeInfo() {
		this(3);
		System.out.println("zero parametrized constructor");

	}

	public static void main(String[] args) {
		EmployeeInfo obj = new EmployeeInfo();

	}

}
