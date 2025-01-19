package com.anisha.pojo;

// POJO Class : Plain Old Java Object
public class Empolyee {

//	Defining Private var
	private String name;
	private int Id;
	private String department;
	private double salary;

//	Constructor
	
	public Empolyee()
	{
		
	}
	public Empolyee(String name, int Id, String department, double salary) {
		this.name = name;
		this.Id = Id;
		this.department = department;
		this.salary = salary;
	}

//	make them public using setter & getter method

//	String name : set method
	public void setName(String name) {
		this.name = name;
	}

//	String name : get method
	public String getName() {
		return this.name;
	}

//	int Id : set method
	public void setId(int Id) {
		this.Id = Id;
	}

//	int Id : get Method
	public int getId() {
		return this.Id;
	}

//	String departmaent : set method
	public void setDepartment(String department) {
		this.department = department;
	}

//	String departmaent : get method
	public String getDepartment() {
		return this.department;
	}

//	double salary:get method
	public double getSalary() {
		return this.salary;
	}

//	double salary:set method
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
