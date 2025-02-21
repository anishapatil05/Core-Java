package com.anisha.collectionfw.set.treeset.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class Example1 {

//	Write a prog to insert String data to perform sorting in reverse of alphabetical oreder
	public static void main(String[] args) {
	TreeSet<String> names = new TreeSet<String>(new myComp());
	names.add("anuu");
	names.add("sanuu");
	names.add("anisha");
	names.add("sanika");
	
	System.out.println(names);
	}

}
class myComp implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {

		return s2.compareTo(s1);
	}
	
}
