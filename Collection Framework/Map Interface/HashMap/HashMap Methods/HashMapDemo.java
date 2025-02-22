package com.anisha.collectionfw.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Anisha");
		map.put(2, "nisha");
		map.put(3, "isha");
		map.put(4, "neha");
		
		System.out.println(map);      //{1=Anisha, 2=nisha, 3=isha, 4=neha}
		
		String value = map.get(5);
		 System.out.println(value);   //null
		 
		  String val = map.getOrDefault(4, "prema");   //map.put(4, "neha");
		System.out.println(val);   //neha
		
		String v = map.getOrDefault(5, "pari");
		System.out.println(v);
		
		System.out.println(map); 
		System.out.println(map.containsKey(4));
		
		System.out.println(map.containsValue("a"));
		
	     
	     
	    
	}

}
