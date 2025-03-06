package com.anisha.nestedclasses.methlocalinnerclass;

//Nested Classes  : 2. Method local Inner Class

// Inner class inside for loop also possible inside method
public class Outer2 {

	void m1() {
		for (int i = 0; i < 5; i++) {
			class Inner {
				public void m2() {
					System.out.println("Good morning");
				}
			}

			Inner obj = new Inner();
			obj.m2();

		}

	}

	public static void main(String[] args) {
		Outer2 o = new Outer2();
		o.m1();

	}

}
