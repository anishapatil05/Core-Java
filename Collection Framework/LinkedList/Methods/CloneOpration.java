package com.anisha.collectionfw.linkedlist.oprations;

import java.util.LinkedList;

public class CloneOpration {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Anuuu");
		ll.add("Shreya");
		ll.add("Saniya");
		ll.add("Apeksha");

		System.out.println("Originbal List");
		System.out.println(ll);

		LinkedList<String> ll2 = new LinkedList<String>(ll);
		ll2.add("Anisha");
		ll2.add("Shreyashri");

		System.out.println("Modified List");
		System.out.println(ll2);

		System.out.println("Duplicate");
		LinkedList<String> clonedCopy = (LinkedList<String>) ll2.clone();
		System.out.println(clonedCopy);

	}

}
