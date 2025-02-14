package com.anisha.collectionfw.demos;

import java.util.ArrayList;

// Conversion of generic ArrayList to Array
public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Chetan");
		al.add("Gitaanjali");

		String[] names = new String[al.size()];

		al.toArray(names);

		for (String name : names) {
			System.out.println(name);
		}

	}

}
