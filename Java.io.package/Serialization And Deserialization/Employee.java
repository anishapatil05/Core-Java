package com.anisha.iostreams.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	String name;
	int id;
	transient double marks;

	public Employee(String name, int id, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public static void main(String[] args) throws Exception {

		Employee e = new Employee("Anisha", 111, 90);

//		Serilazation : write data into file or process of sending object acoross network

		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("Serilazation is completed....");

//		Deserilization : read data from file or object
		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp = (Employee) ois.readObject();
		System.out.println("name " + emp.name + " " + "ID " + emp.id + " " + "marks " + emp.marks);
		System.out.println("de serilization is completed...");

	}

}
