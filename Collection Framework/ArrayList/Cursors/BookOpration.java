package com.anisha.collectionfw.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class BookOpration {

	public static void main(String[] args) {

		Book b1 = new Book(111, "Aurora", "G.k");
		Book b2 = new Book(222, "C", "Denis Ritchi");
		Book b3 = new Book(333, "CPP", "ratan");
		Book b4 = new Book(444, "JAVA", "kavi");

		ArrayList<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);

//        remove 111 id object 

		Iterator<Book> itr = books.iterator();

		while (itr.hasNext()) {
			Book book = itr.next();

			if (book.id == 111) {
				itr.remove();
			}

		}

		for (Book b : books) {
			System.out.println(b.id + " " + b.name + " " + b.auther);
		}

	}

}
