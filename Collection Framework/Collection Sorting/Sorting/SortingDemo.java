package com.anisha.collectionfw.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class SortingDemo {

	public static void main(String[] args) {

//		Sorting Case 1 : 1. Data must be Homogenous 
//		                 2. class implemented from comparable interface

		ArrayList<String> al = new ArrayList<>();
		al.add("Anisha");
		al.add("Shreyash");
		al.add("Raha");

		System.out.println("Before Sorting: " + al); // [Anisha, Shreyash, Raha]

//		Assending Order
		Collections.sort(al);
		System.out.println("After Sorting: " + al); // [Anisha, Raha, Shreyash]

//		Desending Order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Reverse Order: " + al); // [Shreyash, Raha, Anisha]

//		Case 2: Sorting of heterogenous data is not posible 
//		java.lang.ClassCastException:
		LinkedList ll = new LinkedList();
		ll.add("Anuu");
		ll.add(45);
		ll.add(56.9);
		Collections.sort(ll);

//		Case 3 : Sorting with null produce exception
//		java.lang.NullPointerException
		Vector<String> v = new Vector<>();
		v.add("String");
		v.add(null);
		Collections.sort(v);

	}

}
