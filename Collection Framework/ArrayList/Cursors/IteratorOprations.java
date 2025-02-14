package com.anisha.collectionfw.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorOprations {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Anisha");
		al.add("Shreyash");
		al.add("Apeksha");
		al.add("Siddhant");

//		remove Siddhant
//		Reading data by Iterator cursor
		Iterator<String> itr = al.iterator();

		System.out.println("Before removing: " + al);
		while (itr.hasNext()) {
			String name = itr.next();
			if (name.equals("Siddhant")) {
				itr.remove();
			}
		}

		System.out.println("After removing: " + al);
	}

}
