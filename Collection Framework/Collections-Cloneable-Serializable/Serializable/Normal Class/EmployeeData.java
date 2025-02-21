package com.anisha.collections.serilazing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	
}
class Product implements Serializable{
	
}
public class EmployeeData {

//	Writing data in file
	void serilization() throws IOException {
		Employee emp = new Employee("Anisha", 111, 30000);
		Student s = new Student();
		Product p = new Product();

		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.writeObject(s);
		oos.writeObject(p);
		
		oos.close();
		System.out.println("Serilazation process is complete....");

	}

//	Reading data into file
	void deSerialization() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		Employee emp = (Employee) ois.readObject();
		Student stu = (Student) ois.readObject();
		Product prod =(Product) ois.readObject();
		
		System.out.println(emp.id + " " + emp.name + " " + emp.salary);
		System.out.println(stu);
		System.out.println(prod);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		EmployeeData obj = new EmployeeData();
		obj.serilization();
		obj.deSerialization();
	}

}
