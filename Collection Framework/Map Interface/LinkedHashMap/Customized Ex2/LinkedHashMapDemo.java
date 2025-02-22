package com.anisha.collectionfw.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Employee, Product> lmap = new LinkedHashMap<Employee, Product>();
		lmap.put(new Employee("Ansiha", 111), new Product("Pen", 1));
		lmap.put(new Employee("Nsiha", 222), new Product("Pencil", 2));
		lmap.put(new Employee("Abhishek", 333), new Product("Handwash", 3));
		lmap.put(new Employee("Neha", 444), new Product("Book", 4));

//		        Printing Employee Data
		System.out.println("****Employee Data****");
		for (Employee ee : lmap.keySet()) {

			System.out.println(ee.eid + " " + ee.ename);
		}
		System.out.println();

//		Printing Product Data
		System.out.println("****Product Data******");
		for (Product prod : lmap.values()) {

			System.out.println(prod.pid + " " + prod.pname);
		}
		System.out.println();

//		Printing all LinkedHashdata

		Set<Entry<Employee, Product>> allval = lmap.entrySet();

		Iterator<Entry<Employee, Product>> itr = allval.iterator();

		while (itr.hasNext()) {
			Entry<Employee, Product> ep = itr.next();
			Employee ee = ep.getKey();
			System.out.println(ee.eid + " " + ee.ename);

			Product prod = ep.getValue();
			System.out.println(prod.pid + " " + prod.pname);
		}

	}

}
