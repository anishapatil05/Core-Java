package com.anisha.objectclasses;

import java.time.LocalDate;

public class Product {

	public static void main(String[] args) {
		ProductDetails product = new ProductDetails();
		product = new ProductDetails(1, "laptop", LocalDate.of(2028, 5, 5));
		System.out.println(product);

		System.out.println(product.hashCode());

		// equals
		ProductDetails p2 = new ProductDetails(6, "handwash", LocalDate.of(2034, 7, 31));
		System.out.println("Same or not? " + product.equals(p2)); // false : from their ML

		ProductDetails p3 = product;
		System.out.println("Same or not? " + p3.equals(product)); // true

		System.out.println("same or not? " + p2.equals(p3)); // false

	}

}
