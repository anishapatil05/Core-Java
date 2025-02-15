package com.anisha.collectionfw.vector.constructors;

import java.util.ArrayList;
import java.util.Vector;

public class Constructors {

	public static void main(String[] args) {

		// Default Constructor
		Vector<String> v = new Vector<>();
		v.add("Anisha");
		v.add("Shreya");
		v.add("Anuuu");
		System.out.println(v.capacity()); // 10

//		2.Constructor  : If you want to give user capacity
		Vector<String> v2 = new Vector<>(2);
		System.out.println(v2.capacity()); // 2
		v2.add("Anisha");
		v2.add("Shreya");
		v2.add("Anuuu");
		System.out.println(v2.capacity()); // 4

//		2.Constructor  : If you want to give user capacity (initial capacity) & also incremental cap
		Vector<String> v3 = new Vector<>(2, 5);
		System.out.println(v3.capacity()); // 2
		v3.add("Anisha");
		v3.add("Shreya");
		v3.add("Anuuu");
		System.out.println(v3.capacity()); // 7
		v3.add("Anisha");
		v3.add("Shreya");
		v3.add("Anuuu");
		v3.add("Anisha");
		v3.add("Shreya");
		v3.add("Anuuu");
		System.out.println(v3.capacity()); // 12

//		3.Constructor  :Adding one collection data to another
		ArrayList<String> al = new ArrayList<>();
		al.add("Sanuu");
		al.add("Siddu");

		Vector<String> v4 = new Vector<>(al);
		v4.add("Apeksha");
		System.out.println(v4);

	}

}
