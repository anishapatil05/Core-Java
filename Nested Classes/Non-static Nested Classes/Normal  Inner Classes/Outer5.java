package com.anisha.nestedclasses.normalinnerclass;

//Nested Classes : 1.Normal Inner Class
// Outer & Inner class method name is same 
public class Outer5 {
	private int a = 6;

	void m1() {
		System.out.println("m1 meth of outer class");
	}

	class Inner {
		void m1() {
			System.out.println("m1 meth of inner class");
			System.out.println(a);
		}
	};

	public static void main(String[] args) {
		Outer5 o = new Outer5();
		Outer5.Inner i = new Outer5().new Inner();
		i.m1();
		o.m1();
	}

}
