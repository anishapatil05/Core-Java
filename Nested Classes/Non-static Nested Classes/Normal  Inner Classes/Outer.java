package com.anisha.nestedclasses.normalinnerclass;
//   Nested Classes : 1.Normal Inner Class

// Inner Class can aacees all members of Outer class & private properties also.
public class Outer {

	private int a = 20;
	private int b = 9;

	private void m1() {
		System.out.println("Outer class method");
	}

	class Inner {
		int x = 10, y = 20;

		void m2() {
			System.out.println("Inner class method");
			m1();
			System.out.println(a + b);
			System.out.println(x + y);
		}

	}

	public static void main(String[] args) {
		Outer.Inner i = new Outer().new Inner();
		i.m2();

	}

}
