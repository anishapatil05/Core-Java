package com.anisha.customized;

import java.util.Comparator;
import java.util.TreeSet;

public class ProductDetails {

	public static void main(String[] args) {
		Product p1 = new Product("Pen", 444, 80);
		Product p2 = new Product("Handwash", 111, 56);
		Product p3 = new Product("Pencil", 333, 8);
		Product p4 = new Product("NoteBook", 444, 50);
		
		
		TreeSet<Product> products = new TreeSet<Product>(new products());
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		for(Product p : products) {
			System.out.println(p.name+" "+p.id+""+p.cost);
		}

	}

}
class products implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.name.compareTo(p2.name);
	}
	
}
