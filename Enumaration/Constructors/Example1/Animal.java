package com.anisha.enumeration.constructors;

public enum Animal {

	CAT, DOG(10), FISH(10,20);

	static {
		System.out.println("Static block");
	}
	{
		System.out.println("Instance block");
	}
	private Animal() {
		System.out.println("0 arg Constructor");
	}
	private Animal(int a) {
		System.out.println("1 arg Constructor");
	}
	private Animal(int a, int b) {
		System.out.println("2 arg Constructor ");
	}
	public static void main(String[] args) {
		System.out.println("enum main method");
	}
}
