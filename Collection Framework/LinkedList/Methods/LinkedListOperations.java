package com.anisha.collectionfw.linkedlist.oprations;

import java.util.LinkedList;

public class LinkedListOperations {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Anuuu");
		ll.add("Shreya");
		ll.add("Saniya");
		ll.add("Apeksha");

//		add()
		ll.addFirst("Shreyash"); // [Shreyash, Anuuu, Shreya, Saniya, Apeksha]
		ll.addLast("Siddhant"); // [Shreyash, Anuuu, Shreya, Saniya, Apeksha,Siddhant]

		ll.add(2, "Neha"); // [Shreyash, Anuuu,Neha, Shreya, Saniya, Apeksha,Siddhant]

//		set()
		ll.set(4, "Shraddha"); // [Shreyash, Anuuu,Neha, Shreya, Shraddha, Apeksha,Siddhant]

		System.out.println(ll);

//		remove()
		ll.remove(1); // [Shreyash,Neha, Shreya, Shraddha, Apeksha,Siddhant]
		ll.remove("Neha"); // [Shreyash,Shreya, Shraddha, Apeksha,Siddhant]

		System.out.println(ll);

//		get()
		System.out.println(ll.get(2)); // Shraddha
		System.out.println(ll.getFirst()); // Shreyash
		System.out.println(ll.getLast()); // Siddhant

		LinkedList<String> ll2 = new LinkedList<String>(ll);
		ll2.add("Anisha");
		ll2.add("Shreyashri");
		System.out.println(ll2); // [Shreyash, Shreya, Shraddha, Apeksha, Siddhant, Anisha, Shreyashri]

		ll2.removeAll(ll);
		System.out.println(ll2); // [Anisha, Shreyashri]

		// reversed()
		System.out.println(ll2.reversed());

		boolean str = ll2.contains("Anisha");
		System.out.println(str); // true

		str = ll2.containsAll(ll); // false;
		System.out.println(str);

	}

}
