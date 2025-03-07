package com.anisha.nestedclasses.staticnestedclass;

// Nested classes : 1. Static Inner class

//  It is able to acces only static members of outer class
public class Outer {
	static int a = 78;
	int b = 90;

	static class Inner {

		int e=9;
		void m1() {
			System.out.println(a);
//			System.out.println(b);      Comilation Error
		    System.out.println(e);
		}

	}

	public static void main(String[] args) {
		Outer.Inner i = new Outer.Inner();
		i.m1();
	}

}
