package com.anisha.accessmodifiers2;

import com.anisha.accessmodifiers.*;

public class EmpolyeeDetails1 {

	public static void main(String[] args) {
		System.out.println("****Different Package non-sub class****");
		Empolyee employee = new Empolyee();
//		System.out.println("default: " + employee.age);

		/*
		 * System.out.println("private: "+employee.salary); gives compiletime error :
		 * private
		 */
//		System.out.println("protected: " + employee.ID);

//      public method		
		employee.printingInfo();
//		employee.work();

	}

}
