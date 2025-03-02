package com.anisha.streamapi;

public class Employee {

	private String name;
	private double salary;
	private int id;
	private int age;
	private char gender;
	private int joinigYear;
	
	public Employee(String name, double salary, int id, int age, char gender,int joinigYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.joinigYear=joinigYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getJoiningYear() {
		return this.joinigYear;
	}
	
	public void setJoinigYear(int joinigYear) {
		this.joinigYear = joinigYear;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + ", age=" + age + ", gender=" + gender +", Joining Year=" +joinigYear
				+ "]";
	}

	
	
	
	
	
}
