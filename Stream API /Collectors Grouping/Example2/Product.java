
package com.anisha.streamapi.grouping;

public class Product {

	private String name;
	private int id;
	private String category;
	private double price;
	private String brand;
	
	
	
	public Product() {
		super();
	}


	public Product(String name, int id, String category, double price, String brand) {
		super();
		this.name = name;
		this.id = id;
		this.category = category;
		this.price = price;
		this.brand = brand;
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


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return "name: "+name+" , ID: "+id+" , Category: "+category+" ,Price: "+price+" ,Brand: "+brand;
	}

}
