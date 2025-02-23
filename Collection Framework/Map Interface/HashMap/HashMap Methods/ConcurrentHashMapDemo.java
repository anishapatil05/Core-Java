package com.anisha.collectionfw.hashtable;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

//	ConcurrentHashMap is thread safe insted of using HashMap
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> cmap = new ConcurrentHashMap<Integer, String>();
		cmap.put(3, "prn");
		cmap.put(null, "nj");

//	java.lang.NullPointerException
		System.out.println(cmap);

	}

}
