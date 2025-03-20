package com.anisha.bacis;

//Ways to how objects are eligibal for garbage collector  : 
//                    2. Assiginig one reference var of one obj to another ref of obj

public class Test2 {

	public void finalize() {
		System.out.println("Object Destroyed");
	}

	public static void main(String[] args) {

		Test2 t = new Test2();
		Test2 t1 = new Test2();

		t = t1; // Here then GC destroy the obj t bcz the t1 is assiginig that

		System.out.println(t);
		System.out.println(t1);

		System.gc(); // not graunted
	}

}
