package com.anisha.collectionfw.setInterface.nonprimdata;

import java.util.Objects;

public class Student {

	private String name;
	private int id;
	private double marks;
	
	public Student(String name, int id, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,marks,name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}
	
}
