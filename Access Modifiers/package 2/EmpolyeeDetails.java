package com.anisha.accessmodifiers2;

import com.anisha.accessmodifiers.*;

/* Access modifers : 1.public
 *                    2.private
 *                    3.public
 *                    4.protected  */

public class EmpolyeeDetails extends Empolyee {

	public static void main(String[] args) {
		System.out.println("****Different package sub class ****");
		EmpolyeeDetails employeeDetails = new EmpolyeeDetails();
//		System.out.println("default: " + employee.age);

		/*
		 * System.out.println("private: "+employee.salary); gives compiletime error :
		 * private
		 */
		System.out.println("protected: " + employeeDetails.ID);
		employeeDetails.printingInfo();

		employeeDetails.work();

	}

}
