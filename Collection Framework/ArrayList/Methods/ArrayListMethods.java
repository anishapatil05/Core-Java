package com.anisha.collectionfw.demo;

import java.util.*;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

//	 1. add()  -> add values in ArrayList
		names.add("Anisha");
		names.add("Nisha");
		names.add("Apeksha");
		names.add("Abhishek");
		names.add("Shreyash");
		
		

//	Priniting all values in the ArrayList
		System.out.println(names);

//	2.get()   -> Read specific value in the ArrayList 
//	If index is out of bound then it gives indexOutBoundException
		System.out.println(names.get(4));

//	3.size()   -> size of ArrayList
		System.out.println(names.size());

//	4.for()   -> Priniting all values in the ArrayList

		for (int i = 0; i <= names.size() - 1; i++) {
			System.out.println(names.get(i));
		}
		System.out.println();

//	5. forEach Loop : Alternative way
		System.out.println("****For Each Loop****");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();

//	6.iterator : Priting all values in the ArrayList
		System.out.println("****Iterator type *******");
		Iterator<String> values = names.iterator();

		while (values.hasNext()) {
			System.out.println(values.next());
		}

//		7.remove(idx)  -> removing elemnt from certain index
		System.out.println(names.remove(0));
		System.out.println(names);

		names.add("Nisha");

//		8.remove(object)  -> if duplicate occores then it give priority to 1st
		System.out.println(names.remove("Nisha"));
		System.out.println(names);

//		9.addFirst() -> added value at first postion
		names.addFirst("Anuuu");
		System.out.println(names);

//		10.addLast()  -> added value to last position
		names.addLast("Shauyyaaa");
		System.out.println(names);

//		11.clear -> it clears all values from the ArrayList
		names.clear();
		System.out.println(names);

	}

}
