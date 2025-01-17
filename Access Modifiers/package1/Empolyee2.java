package com.anisha.accessmodifiers;

public class Empolyee2 {

	public static void main(String[] args) {
		System.out.println("****Same package non-sub class****");
		Empolyee employee = new Empolyee();
		System.out.println("default: " + employee.age);

		/*
		 * System.out.println("private: "+employee.salary); gives compiletime error :
		 * private
		 */
		System.out.println("protected: " + employee.ID);
		employee.printingInfo();
		employee.work();

	}

}
