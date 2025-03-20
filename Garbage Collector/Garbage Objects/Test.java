package com.anisha.bacis;

// Ways to how objects are eligibal for garbage collector  : 
//                1. Assiginig null constatnts to objects
public class Test {

	public void finalize() {
		System.out.println("Object destroyed");
	}

	public static void main(String[] args) {

		Test t = new Test();
		Test t1 = new Test();
		Test t3 = new Test();

		System.out.println(t.toString()); // com.anisha.bacis.Test@4517d9a3
		System.out.println(t1.toString()); // com.anisha.bacis.Test@372f7a8d
		System.out.println(t3.toString()); // com.anisha.bacis.Test@2f92e0f4

		t = null;
		t1 = null;
		System.out.println(t); // null
		System.out.println(t1); // null

		System.gc(); // if call then and then only finalize meth will be called

	}

}
