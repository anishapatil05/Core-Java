package com.anisha.nestedclasses.normalinnerclass;

//Nested Classes : 1.Normal Inner Class
// Variables with different names
public class Outer2 {
	int a = 78, b = 56;

	class Inner {
		int x = 9, y = 8;

		void m2(int i, int j) {
			System.out.println(i + j);
			System.out.println(x + y);
			System.out.println(a + b);

		}
	}

	public static void main(String[] args) {
		new Outer2().new Inner().m2(1000, 2000);

	}

}
