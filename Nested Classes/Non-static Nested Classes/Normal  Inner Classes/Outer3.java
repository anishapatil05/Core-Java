package com.anisha.nestedclasses.normalinnerclass;

//Nested Classes : 1.Normal Inner Class
// Variables with same name & It increse code readbility
public class Outer3 {

	int a = 10, b = 20;

	class Inner {
		int a = 100, b = 200;

		void m2(int a, int b) {

			System.out.println(a + b); // 3000
			System.out.println(this.a + this.b); // 300
			System.out.println(Outer3.this.a + Outer3.this.b); // 30
		}
	}

	public static void main(String[] args) {
		new Outer3().new Inner().m2(1000, 2000);

	}

}
