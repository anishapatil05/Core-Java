package com.anisha.nestedclassanonymous;

import java.util.HashMap;

// Anonymous inner class : HashMap 
public class Outer2 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>() {
			public String put(Integer key, String value) {
				System.out.println("Putting key " + key + " value " + value);
				return super.put(key, value);
			}

		};

		map.put(111, "anu");
		map.put(8, "nuu");

	}

}
