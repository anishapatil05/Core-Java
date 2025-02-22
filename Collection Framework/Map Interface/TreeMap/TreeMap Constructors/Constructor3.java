package com.anisha.collectionfw.treemap.constructors;

import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class Constructor3 {

	public static void main(String[] args) {

//		Constructor 3 : TreeMap with sorted SubMap

		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
		tmap.put("anuu", 78);
		tmap.put("sanuu", 88);
		tmap.put("pemu", 89);
		tmap.put("januu", 14);
		tmap.put("saniya", 89);
		tmap.put("neha", 14);

//		Sorting is done based on String
		System.out.println(tmap); // {anuu=78, januu=14, neha=14, pemu=89, saniya=89, sanuu=88}

		SortedMap<String, Integer> smap = tmap.subMap("anuu", "saniya");
		TreeMap<String, Integer> newTmap = new TreeMap<String, Integer>(smap);

		if (newTmap.containsKey("anuu")) {
			System.out.println("anu is great");
		}
		System.out.println();
		if (newTmap.containsValue(14)) {
			System.out.println("number is great");
		} else {
			System.out.println("please enter a correct one ");
		}

		Set<Entry<String, Integer>> allEntery = newTmap.entrySet();
		Iterator<Entry<String, Integer>> itr = allEntery.iterator();

		while (itr.hasNext()) {
			Entry<String, Integer> e = itr.next();

			String str = e.getKey();
			if (str.equals("januu")) {
				itr.remove();
			}
		}

		for (Entry<String, Integer> e : newTmap.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
