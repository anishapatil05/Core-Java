package com.anisha.collectionfw.cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class BookDetails {

	public static void main(String[] args) {
		Book b1 = new Book("CPP", 111, "Banjarne Stroustrup");
		Book b2 = new Book("C", 222, "Denis ritchi");
		Book b3 = new Book("JAVA", 333, "Jems Gosling");

		LinkedList<Book> books = new LinkedList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);

		ListIterator<Book> listItr = books.listIterator();
		listItr.add(new Book("Unlock your futur", 444, "Nim Gholkar"));
		while (listItr.hasNext()) {
			Book book = listItr.next();
			if (book.id == 333) {
				listItr.remove();
			}
		}
		for (Book b : books) {
			System.out.println(b.name + " " + b.id + " " + b.author);
		}

		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}

	}

}
