package com.anisha.collectionfw.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethods {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Anisha");
		map.put(2, "nisha");
		map.put(3, "isha");
		map.put(4, "neha");

		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		System.out.println();

		Collection<String> values = map.values();
		System.out.println(values);
		System.out.println();

		Set<Entry<Integer, String>> allval = map.entrySet();
		for (Entry<Integer, String> val : allval) {
			System.out.println(val.getKey() + " " + val.getValue());
		}

	}

}
