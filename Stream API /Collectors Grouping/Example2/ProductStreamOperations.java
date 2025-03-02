package com.anisha.streamapi.grouping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ProductStreamOperations {

	public static void main(String[] args) {

		ArrayList<Product> allProdInfo = getAllProductInfo();

//		REQ : Get all products count based on Category
		Map<String, Long> prodCountBasedOnCount = allProdInfo.stream()
				.collect(Collectors.groupingBy(p -> p.getCategory(), Collectors.counting()));

		System.out.println(prodCountBasedOnCount); // {Clothing=2, Footwear=2, Electronics=3}
		System.out.println();

//		REQ : GET all products name and brand

		Map<String, String> prodOfNameAndBrand = allProdInfo.stream()
				.collect(Collectors.toMap(p -> p.getName(), p -> p.getBrand()));

		System.out.println(prodOfNameAndBrand);
		System.out.println();

//	   REQ : Get All Products having price is grater than 50000 whose name & Brand;

		Map<String, String> prodNameBasedOnPrice = allProdInfo.stream().filter(p -> p.getPrice() >= 50000)
				.collect(Collectors.toMap(p -> p.getName(), p -> p.getBrand()));
		System.out.println(prodNameBasedOnPrice);
		System.out.println();

//    REQ : Get product count based on price, but only for products priced above ₹50,000.

		Map<Double, Long> prodBaseOnPrice = allProdInfo.stream().filter(p -> p.getPrice() >= 50000)

				.collect(Collectors.groupingBy(p -> p.getPrice(), Collectors.counting()));
		System.out.println(prodBaseOnPrice);
		System.out.println();

//		REQ : Get all Products  avg price

		Double avgPrice = allProdInfo.stream().collect(Collectors.averagingDouble(p -> p.getPrice()));
		System.out.println("Avarage of Products Price " + avgPrice);
		System.out.println();

//		REQ : Get  sum all Products price

		Double sumOfProdPrice = allProdInfo.stream().collect(Collectors.summingDouble(p -> p.getPrice()));
		System.out.println("Sum of Product Price: " + sumOfProdPrice);
		System.out.println();

// "Get product names grouped by their category, but only for products priced above ₹60,000."

		Map<String, List<String>> prodInformation = allProdInfo.stream().filter(p -> p.getPrice() >= 60000).collect(
				Collectors.groupingBy(p -> p.getCategory(), Collectors.mapping(p -> p.getName(), Collectors.toList())));
		System.out.println(prodInformation); // {Electronics=[iPhone 15, Samsung Galaxy S23]}

	}

	public static ArrayList<Product> getAllProductInfo() {

		ArrayList<Product> allProductInfo = new ArrayList<>();

		// Product(String name, int id, String category, double price, String brand)
		allProductInfo.add(new Product("iPhone 15", 1, "Electronics", 79999.99, "Apple"));
		allProductInfo.add(new Product("Samsung Galaxy S23", 2, "Electronics", 74999.50, "Samsung"));
		allProductInfo.add(new Product("Nike Running Shoes", 3, "Footwear", 5999.99, "Nike"));
		allProductInfo.add(new Product("Dell Inspiron Laptop", 4, "Electronics", 54999.99, "Dell"));
		allProductInfo.add(new Product("Levi's Denim Jacket", 5, "Clothing", 3499.00, "Levi's"));
		allProductInfo.add(new Product("Adidas Ultraboost 22", 6, "Footwear", 12999.99, "Adidas"));
		allProductInfo.add(new Product("Puma Hoodie", 7, "Clothing", 2499.99, "Puma"));

		return allProductInfo;

	}

}
