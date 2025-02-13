package com.anisha.collectionfw.arrayList.demo;

import java.util.ArrayList;

public class Constructors {

	public static void main(String[] args) {
	
		Employee e1 = new Employee("Anisha", 111);
		Employee e2 = new Employee("Nisha", 222);
		Employee e3 = new Employee("Apeksha", 333);
		Employee e4 = new Employee("Abhishek", 444);
		
//		Default Constructor
	ArrayList<Employee> employee = new ArrayList<>();
	   employee.add(e1);
	   employee.add(e2);
	   
//	   Constructor with user-given intinal capacity
	   ArrayList<Employee> employees = new ArrayList<>(30);
	   
//	   constructor : adding one collection data to another
	   ArrayList<Employee> employee2 = new ArrayList<>(employee);
	   employee2.add(e3);
	   employee2.add(e4);
	   
	   for(Employee e : employee2) {
		   System.out.println(e.eid+" "+e.ename);
		   
	   }
	   
 
	}

}
