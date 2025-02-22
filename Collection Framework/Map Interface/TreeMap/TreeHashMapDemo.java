package com.anisha.collectionfw.treemap;
import java.util.TreeMap;

import java.util.*;
import java.util.Map.Entry;

public class TreeHashMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap = new TreeMap<Integer, String>();
		tmap.put(5, "anu");
		tmap.put(8, "arachana");
		tmap.put(2, "tabuu");
		tmap.put(9, "prena");
		tmap.put(3, "sanu");
		
		System.out.println(tmap); //{2=tabuu, 3=sanu, 5=anu, 8=arachana, 9=prena}
		
		Collection<String> str = tmap.values();
		System.out.println(str);
		
		Set<Integer> values = tmap.keySet();
		System.out.println(values);  //[2, 3, 5, 8, 9]
		
		for(Integer a : tmap.keySet()) {
			System.out.println(a);      
			
		}
		
		for(String s : tmap.values()) {
			System.out.println(s);
		}
		
//		Sorting is performed based on keys onlyyy
		for(Entry<Integer, String> e : tmap.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
			
			
//			java.lang.NullPointerException
			TreeMap tmap2 = new TreeMap();
//			tmap2.put(null, "anuu");
//			tmap2.put(4,"per");
//			System.out.println(tmap2);
			
//			java.lang.ClassCastException
		      tmap2.put(6, null);
		      tmap2.put("anu", 9);
		      System.out.println(tmap2);
		}
	}

}
