package com.anisha.objectclasses;

import java.time.LocalDate;
import java.util.Objects;

//POJO class
public class ProductDetails {

	private int id;
	private String name;
	private LocalDate expDate;

//	 default constructor
	public ProductDetails() {

	}

//	 parametrized Constructor
	public ProductDetails(int id, String name, LocalDate expDate) {
		this.id = id;
		this.name = name;
		this.expDate = expDate;
	}

//	 setter & getter methods
	public int getId() {
		return this.id;
	}

	public void setId(int Id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getExpDate() {
		return this.expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

// toString()
	@Override
	public String toString() {
		return "Product Detils: " + ", ID: " + id + ", name: " + name + ", Expiray Date: " + expDate;
	}

//	 hashcode 

	@Override
	public int hashCode() {
		return Objects.hash(expDate, id, name);
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
		return Objects.equals(expDate, other.expDate) && id == other.id && Objects.equals(name, other.name);
	}

}
