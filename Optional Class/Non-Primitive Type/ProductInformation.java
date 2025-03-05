package com.anisha.optionalclass.userdefinedClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ProductInformation {

	public static void main(String[] args) {

		ProductInformation obj = new ProductInformation();

//		REQ 1 : Get the Min price of Product

		Optional<Product> prod = obj.getProdInfo();

		if (prod.isPresent()) {
			Product p = prod.get();
			System.out.println("Minimum Price Product Info is: " + p.getName() + " " + p.getId() + " " + p.getPrice());
		} else {
			System.out.println("No value is Present");
		}

	}

	public Optional<Product> getProdInfo() {

		ArrayList<Product> res = getAllProdInfo();

		return res.stream().max(new MyComp());

	}

	public ArrayList<Product> getAllProdInfo() {

		ArrayList<Product> prod = new ArrayList<>();
		prod.add(new Product("Soap", 111, 90, true));
		prod.add(new Product("Pen", 222, 45, false));
		prod.add(new Product("Book", 333, 80, false));
		prod.add(new Product("Suger", 444, 95, true));

		return prod;
	}

}

class MyComp implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {

		if (p1.getPrice() == p2.getPrice()) {
			return 0;
		} else if (p1.getPrice() > p2.getPrice()) {
			return 1;
		} else {
			return -1;
		}

	}

}