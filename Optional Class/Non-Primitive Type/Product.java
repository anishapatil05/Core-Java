package com.anisha.optionalclass.userdefinedClasses;

public class Product {

	private String name;
	private int id;
	private double price;
	private boolean isExpired;

	public Product(String name, int id, double price, boolean isExpired) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.isExpired = isExpired;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getProdIsExpired() {
		return this.isExpired;
	}

	public void setProdIsExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}

}
