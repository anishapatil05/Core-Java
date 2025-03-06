package com.anisha.nestedclasses.methlocalinnerclass;

// Nested Classes  : 2. Method local Inner Class

// Inner class Inside method
public class Outer {

	Outer()
	{
	System.out.println("Outer class Const");	
	}
	private int a = 90;

	void m1() {
		class Inner {

			void m2() {
				System.out.println("inner class method");
				System.out.println(a);
			}
		}

		Inner i = new Inner();
		i.m2();

	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.m1();

	}

}
