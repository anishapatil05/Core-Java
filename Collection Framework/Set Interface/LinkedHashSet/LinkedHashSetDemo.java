package com.anisha.collectionfw.setInterface.LinkedhashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

//		Insertion Order is preserved
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		names.add("anuu");
		names.add("sanuu");
		names.add("ketuu");

		System.out.println(names);
		System.out.println(names.add("sanuu"));

		LinkedHashSet<String> namess = new LinkedHashSet<String>(names);
		namess.add("nehu");
		System.out.println(namess);
	}

}
