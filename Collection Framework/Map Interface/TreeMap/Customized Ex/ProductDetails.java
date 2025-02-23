package com.anisha.collectionfw.treemap.customized;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ProductDetails {

	public static void main(String[] args) {
		TreeMap<Product, Integer> names = new TreeMap<>(new MyComp());
		names.put(new Product("Pen", 111, 30), 1);
		names.put(new Product("Pencil", 222, 10), 2);
		names.put(new Product("Notebook", 333, 50), 3);
		names.put(new Product("Book", 444, 80), 5);

//		Overriding old one according to prod name
		names.put(new Product("Book", 444, 80), 6);

		for (Entry<Product, Integer> e : names.entrySet()) {

			Integer i = e.getValue();
			System.out.println(i);

			Product prod = e.getKey();
			System.out.println(prod.name + " " + prod.id + " " + prod.cost);

		}

	}

}

class MyComp implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {

		return p1.name.compareTo(p2.name);
	}

}
