package com.anisha.thiskeyword;

//Example of this & super keyword
public class Manager extends Employee {
	String name = "sanuu";
	int age = 6;

	public void work() {
		System.out.println("Employee class : backend ");
	}

	public void salaryofwork() {
		System.out.println("salary: 70000");
//        	anisha
		System.out.println(super.name);
//        	6
		System.out.println(this.age);
//           Parent work()
		super.work();
	}

	public static void main(String[] args) {
		Manager obj = new Manager();
		obj.salaryofwork();

	}

}
