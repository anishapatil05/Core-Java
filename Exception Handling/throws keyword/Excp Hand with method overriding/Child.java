package com.anisha.eceptionhandling.trycatch.blocks;

// Note : The Eception handling with method Overriding the child class contains only uncheked exceptions 
public class Child extends Parent {

	void method1() throws ArithmeticException {
		System.out.println("child method");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.method1();

	}

}
