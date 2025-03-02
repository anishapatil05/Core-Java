package com.anisha.string.imutableclass;

public class EmployeeDetails {

//	Here immutable means we are not cahnging content inside object whatever happens it cannot be change 
//	by default u want then create new Obj
	public static void main(String[] args) {

		// The original "Anisha" object is not modified—it still exists in memory but is
		// now unreachable
		Employee emp = new Employee("Anisha");

//		 immutability applies to the object, not to the reference variable pointing to it.
		System.out.println(emp.getName()); // Anisha
		Employee emp2 = new Employee("ann");

		emp = emp2;
		System.out.println(emp.getName()); // emp points to new object i.e ann

	}

}
