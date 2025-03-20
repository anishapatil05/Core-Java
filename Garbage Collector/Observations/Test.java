package com.anisha.grabagecollector.observations;

/* Case 1: Ones the m1() is completed then the e2 is eligibal for garbage collector
    & e is returned to main() that is holding that main method in emp ref var */
public class Test {
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

		Employee emp = new Test().m1();
		System.out.println(emp);

		System.gc();

	}

}
