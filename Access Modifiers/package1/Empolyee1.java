package com.anisha.accessmodifiers;

public class Empolyee1 extends Empolyee {

	public static void main(String[] args) {
		System.out.println("****Same package sub class****");
		Empolyee1 employee = new Empolyee1();
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
