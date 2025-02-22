package com.anisha.collectionfw.treemap.constructors;

import java.util.TreeMap;

public class Constructor2 {

	public static void main(String[] args) {
		
		
//		Constructor 3: TreeMap with Map Constructor
		TreeMap<String, Character> names = new TreeMap<String, Character>();
		names.put("Anisha", 'F');
		names.put("Prema", 'F');
		
		TreeMap<String, Character> names2 = new TreeMap<String, Character>(names);
		names2.put("Abhishek", 'M');
		System.out.println(names2);      //{Abhishek=M, Anisha=F, Prema=F}

		
		TreeMap<String, Character> tmap3 = new TreeMap<String, Character>();
		tmap3.put("janu", 'F');
		
		TreeMap<String, Character> tmap4 = new TreeMap<String, Character>();
	     tmap4.putAll(tmap4);
	     tmap4.putAll(names2);
	     tmap4.put("karina", 'F');
	     
	     System.out.println(tmap4);
	}

}
