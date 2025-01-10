package com.anisha.polymorphism.methods;

public class Calculator {

	public int add(int x, int y) {
		System.out.println("called: int, int");
		return x + y;
	}

	public Double add(double a, int b) {
		System.out.println("called: double, int");
		return a + b;
	}

	public Double add(double x, double y) {
		System.out.println("called: double, double");
		return x + y;
	}

	public String add(int a, int b, String c) {
		System.out.println("called int , int , String");
		return a + b + c;
	}

	public int sub(int a, int b) {
		System.out.println("called: int, int");
		return a - b;
		
	}

	public double sub(int a, int b, int c) {
		System.out.println("called: int, int, int");
		return a - b - c;
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println(obj.add(2, 3.3));
		System.out.println(obj.add(2, 2, "anu"));
		System.out.println(obj.sub(4, 3));

	}

}
