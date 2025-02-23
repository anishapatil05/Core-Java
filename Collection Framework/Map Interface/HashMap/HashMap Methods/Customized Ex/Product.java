package com.anisha.collectionfw.hashmap;

import java.util.Objects;

public class Product {

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
	public int hashCode() {
		return Objects.hash(cost, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(name, other.name);
	}
	
	
	
}
