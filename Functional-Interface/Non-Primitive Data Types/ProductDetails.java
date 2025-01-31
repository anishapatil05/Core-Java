package com.anisha.functional.Interface.lambdaexp;

import java.util.Objects;

public class ProductDetails {
	private String name;
	private int id;
	private double price;

	public ProductDetails() {

	}

	public ProductDetails(String name, int id, double price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice(double price) {
		return this.price;
	}

	public void setPrice() {
		this.price = price;
	}

// toString()
	@Override
	public String toString() {
		return "ProductDetails: [ name: " + name + ", ID: " + id + ",Price: " + price + " ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDetails other = (ProductDetails) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
}
