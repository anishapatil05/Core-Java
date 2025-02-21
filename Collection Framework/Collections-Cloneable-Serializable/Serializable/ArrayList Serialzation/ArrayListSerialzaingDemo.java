package com.anisha.collections.serilazing.arraylist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerialzaingDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ArrayList<Product> prod = new ArrayList<Product>();
		prod.add(new Product("Pen", 444, 45));
		prod.add(new Product("handwash", 222, 70));
		prod.add(new Product("notebook", 333, 65));
		prod.add(new Product("book", 111, 30));

//		Serialzation Process : Writing object in file

		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(prod);
		oos.close();
		System.out.println("Serialzation Process is complete....");

//		De-serialzation Process : reading the data 

		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		ArrayList<Product> products = (ArrayList<Product>) ois.readObject();

		for (Product p : products) {
			System.out.println(p.pname + " " + p.pid + " " + p.pcost);
		}

	}

}
