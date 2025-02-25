package com.anisha.assignment;

public class Employee {

	private String name;
	private char gender;
	private double salary;

	Employee(String name, char gender,double salary) {
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
