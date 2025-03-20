package com.anisha.bacis;

//Ways to how objects are eligibal for garbage collector  : 
//               3.Obj are inside meth ones meth is completed then obj are destroyed

public class Test3 {

	public void finalize() {
		System.out.println("Object Destroyed");
	}

	void m1() {
		Test3 t = new Test3();
		Test3 t2 = new Test3();
		// Test3 t : stores in Stack Area and it destryes after m1()
		// new Test3 : storing in heap mem but the ref is gone then obj is destroyed in
		// GC
	}

	public static void main(String[] args) {
		Test3 t1 = new Test3();

		t1.m1();

		System.gc();

	}

}
