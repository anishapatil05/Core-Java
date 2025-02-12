package com.anisha.collectionfw.userdefinedclass;

public class Student {
	private String name;
	private int id;
	private double marks;

	public Student() {

	}

	public Student(String name, int id, double marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMarks() {
		return this.marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String toString() {
		return "[ name: " + name + ", id: " + id + " marks: " + marks + "]";
	}
}
