package com.anisha.collectionfw.linkedhashmap.ex;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ProductDetails {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Product> lmap = new LinkedHashMap<Integer, Product>();
		lmap.put(1, new Product("Pen", 111));
		lmap.put(2, new Product("Notebook", 222));
		lmap.put(3, new Product("Book", 333));
		lmap.put(4, new Product("phone", 444));

		Set<Entry<Integer, Product>> allEntery = lmap.entrySet();
		Iterator<Entry<Integer, Product>> itr = allEntery.iterator();

		while (itr.hasNext()) {
			Entry<Integer, Product> e = itr.next();

			Product prod = e.getValue();

			if (prod.id == 111) {
				itr.remove();
			}
			if (prod.name.equals("Book")) {
				itr.remove();
			}
		}

		for (Entry<Integer, Product> allentry : lmap.entrySet()) {
//		

			Integer i = allentry.getKey();
			System.out.println(i);

			Product prod = allentry.getValue();
			System.out.println(prod.id + " " + prod.name);

		}

	}

}
