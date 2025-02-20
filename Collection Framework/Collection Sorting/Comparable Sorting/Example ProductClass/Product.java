package com.anisha.collectionfw.sorting.ex.comparable;

// Req : Print product id in assending order using comparable
public class Product implements Comparable<Product> {

	String name;
	int id;
	double cost;

	public Product(String name, int id, double cost) {
		super();
		this.name = name;
		this.id = id;
		this.cost = cost;
	}

	@Override
	public int compareTo(Product p) {
		if (id == p.id)
			return 0;
		else if (id > p.id) {
			return 1;
		} else {
			return -1;
		}
	}

}
