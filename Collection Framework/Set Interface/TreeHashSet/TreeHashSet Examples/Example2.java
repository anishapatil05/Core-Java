package com.anisha.collectionfw.set.treeset.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class Example2 {

//	Write a prog to insert StringBuffer data into Treeset to perform sorting in alpahabetical order
	public static void main(String[] args) {

		TreeSet<StringBuffer> names = new TreeSet<StringBuffer>(new stringclass());
		names.add(new StringBuffer("AAA"));
		names.add(new StringBuffer("CCC"));
		names.add(new StringBuffer("DDD"));

		System.out.println(names);
	}

}

class stringclass implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer strB1, StringBuffer strB2) {

		String str = strB1.toString();
		String str2 = strB2.toString();
		return str2.compareTo(str);
	}

}
