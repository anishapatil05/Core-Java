package com.anisha.collectionfw.set.treeset.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Example4 {

//	Removing duplicate from ArrayList using set
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("anuu");
		names.add("sanuu");
		names.add("anisha");
		names.add("sanuu");
		
		TreeSet<String> namess = new TreeSet<String>(names);
		System.out.println(namess);
		
		String[] str = {"neha","prema","neha","anisha"};
		
		List<String> str1 = Arrays.asList(str);
		
		TreeSet<String> values = new TreeSet<String>(str1); 
		System.out.println(values);
		

	}

}
