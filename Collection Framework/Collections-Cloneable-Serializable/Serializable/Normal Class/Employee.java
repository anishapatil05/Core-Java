package com.anisha.collections.serilazing;

import java.io.Serializable;

public class Employee implements Serializable {

	String name;
	int id;
	transient double salary;
	public Employee(String name, int id, double salary) {
		
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	
}
