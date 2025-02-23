package com.anisha.collectionfw.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class ProductDetials {

	public static void main(String[] args) {
		
		HashMap< Product,Integer> map = new HashMap<>();
		map.put(new Product("Pen", 111, 40),1);
		map.put(new Product("Book", 222, 50),2);
		map.put(new Product("Notebook", 333, 45),3);
		map.put(new Product("Bat", 111, 40),4);
		map.put(new Product("Pen", 111, 40),5);
		
		System.out.println("Size "+map.size());
		
		for(Entry < Product,Integer> e :map.entrySet()) {
			
			Product p = e.getKey();
			System.out.println(p.name+" "+p.id+" "+p.cost);
		}

	}

}
