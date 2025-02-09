package com.anisha.markerInterface;

public class Test implements Cloneable {

	String name;
	int id;
	long phoneNum;

	public void getInfo(String name, int id, long phoneNum) {
		this.name = name;
		this.id = id;
		this.phoneNum = phoneNum;

	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(phoneNum);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Test obj = new Test();

//		Original One
		obj.getInfo("Anisha", 31, 9226792705l);
		System.out.println("Original Object");
		obj.printInfo();
		System.out.println();
//		Req : I want keep backUp of this data 
//		creating exact duplicate copy then we use clone()

//		Duplicate copy

		Test copy = (Test) obj.clone();
		System.out.println("Copy Of Object");
		copy.printInfo();

	}
}
