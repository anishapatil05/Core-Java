package com.anisha.collectionfw.treemap.constructors;


import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Constructor4 {

	public static void main(String[] args) {
		
		
//		Constructor 4 : passing customized compareator to TreeMap
		
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(new MyComp());
		tmap.put(7, "Anisha");
		tmap.put(4, "nisha");
		tmap.put(6, "isha");
		tmap.put(1, "neha");
		
		for(Entry<Integer, String> e: tmap.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
class MyComp implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
	
		return i2.compareTo(i1);
	}
	
}