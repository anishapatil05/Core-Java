package com.anisha.collectionfw.hashtable;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> htable = new Hashtable<Integer, String>();
		htable.put(1, "anu");
		htable.put(2, "panu");
		htable.put(3, "sanu");

//		java.lang.NullPointerException
		htable.put(null, "jj");

//		java.lang.NullPointerException
		htable.put(null, null);

//		java.lang.NullPointerException
		htable.put(7, null);

		System.out.println(htable);
	}

}
