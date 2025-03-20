package com.anisha.grabagecollector.nonprmex;

public class Test extends Employee {

//	public void finalize()
//	{
//		System.out.println("Object destroyed");
//	}

	public static void main(String[] args) {

		Test t = new Test();
		t = null; // to make inused obj

		Employee e = new Employee();
		e = null;

		Student s = new Student();
		s = null;

		System.gc();

	}

}
