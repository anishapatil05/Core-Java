package com.anisha.collectionfw.vector.cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ProductDetails {

	public static void main(String[] args) {

		Product p1 = new Product("Laptop", 111, 50000);
		Product p2 = new Product("TV", 222, 100000);
		Product p3 = new Product("Washing Macine", 333, 40000);

		Vector<Product> products = new Vector<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);

		System.out.println("***Enumeration Cursor***");
		Enumeration<Product> e = products.elements();
		while (e.hasMoreElements()) {
			Product p = e.nextElement();
			System.out.println(p.id + " " + p.name + " " + p.cost);
		}

		System.out.println("***Iterator Cursor***");
		Iterator<Product> itr = products.iterator();

		while (itr.hasNext()) {
			Product p = itr.next();
			System.out.println(p.id + " " + p.name + " " + p.cost);
		}

		System.out.println("***	ListIterator Cursor***");
		ListIterator<Product> litr = products.listIterator();

//		forword direction
		while (litr.hasNext()) {
			Product p = litr.next();
			System.out.println(p.id + " " + p.name + " " + p.cost);
		}

//		backword direction
		while (litr.hasPrevious()) {
			Product p = litr.previous();
			System.out.println(p.id + " " + p.name + " " + p.cost);
		}

	}

}
