package com.anisha.grabagecollector.observations;

/* Case 2 : Ones the m1() is completed two obj(e,e2) are eligibal for 
 * garbage collection because no one holding that in main()*/


public class Test2 {
	public void finalize() {
		System.out.println("Object destroyed");
	}

	Employee m1() {
		Employee e = new Employee();
		Employee e2 = new Employee(); // is eligibal for GC

		System.out.println(e);
		return e; // returning e and holding main()

	}

	public static void main(String[] args) {
		new Test().m1();

		System.gc();
	}

}
