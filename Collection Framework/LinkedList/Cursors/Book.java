package com.anisha.collectionfw.cursor;

public class Book {

	String name;
	int id;
	String author;

	public Book(String name, int id, String author) {
		super();
		this.name = name;
		this.id = id;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + ", author=" + author + "]";
	}
	
	

}
