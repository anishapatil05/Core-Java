package com.anisha.collectionfw.treemap.constructors;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Constructor1 {

	
	public static void main(String[] args) {
	
//		Constructor 1: TreeMap with default Constructor
		TreeMap<String, Character> names = new TreeMap<String, Character>();
		names.put("Anisha", 'F');
		names.put("Prema", 'F');
		names.put("Abhishek", 'M');
		names.put("Shreyash", 'M');
		
		System.out.println(names);  //{Abhishek=M, Anisha=F, Prema=F, Shreyash=M}
	
		TreeMap<Integer ,String> tmap = new TreeMap<Integer,String>();
		tmap.put(6, "anu");
		tmap.put(4, "aanu");                		/*2 panu
                                                      4 aanu
                                                      6 anu
                                                      9 aaanu*/
		tmap.put(2, "panu");          
		tmap.put(9, "aaanu");
		
		for(Entry<Integer, String> i : tmap.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
		

		
		
		
		
	}

}
