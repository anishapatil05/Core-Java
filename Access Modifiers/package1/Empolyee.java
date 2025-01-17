package com.anisha.accessmodifiers;

/* Access Modifer : 1.public 
 *                  2.private
 *                  3.protected
 *                  4.default      */
public class Empolyee {
	public String name = "Anisha";
	protected int ID = 1234;
	private double salary = 56000;
	int age = 21;

	public void printingInfo() {
		System.out.println("Public method :Name: " + name + " " + "Age: " + age);
	}

	protected void work() {
		System.out.println("Protected method :his work is devlopment");
	}

	public static void main(String[] args) {
		System.out.println("****Same class & Same package****");
		Empolyee employee = new Empolyee();
		System.out.println("default: " + employee.age);
		System.out.println("private: " + employee.salary);
		System.out.println("protected: " + employee.ID);

//	        public method
		employee.printingInfo();
//	        protected method
		employee.work();
	}

}

class EmpolyeeDetails {

	public static void main(String[] args) {
		System.out.println("****Different class & Same package****");
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
