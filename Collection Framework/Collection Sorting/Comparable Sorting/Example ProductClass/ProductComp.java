package com.anisha.collectionfw.sorting.ex.comparable;

import java.util.Collections;
import java.util.LinkedList;

public class ProductComp {

	public static void main(String[] args) {
	     LinkedList< Product> ll = new LinkedList<Product>();
	     ll.add(new Product("Pen", 222, 90));
	     ll.add(new Product("Handwash", 555, 100));
	     ll.add(new Product("Container", 111, 110));
	     ll.add(new Product("Book", 444, 80));
	     
	     Collections.sort(ll);
	     
	     for(Product p : ll) {
	    	 System.out.println(p.id+" "+p.name+" "+p.cost);
	     }
	}

}
