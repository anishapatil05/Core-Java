package com.anisha.collectionfw.linkedlist.constructors;

import java.util.LinkedList;

public class Constructors {

	public static void main(String[] args) {

//		Default Constructor
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Anuuu");
		ll.add("Shreya");
		ll.add("Saniya");
		ll.add("Apeksha");
		System.out.println(ll);

//		Constructor
		LinkedList<String> ll2 = new LinkedList<String>(ll);
		ll2.add("Anisha");
		ll2.add("Shreyashri");

		System.out.println(ll2);

	}

}
