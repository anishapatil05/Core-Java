package com.anisha.collectionfw.setInterface.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

//		Insertion order is not preserved
		HashSet<Character> hs = new HashSet<>();
		hs.add('A');
		hs.add('P');
		hs.add('D');
		hs.add('T');
		hs.add('A');

		System.out.println(hs); // [P, A, D, T]
		System.out.println(hs.add('A')); // false
		System.out.println(hs.add('D')); // false
		System.out.println(hs.add('R')); // true

//		Adding one Collection data to another one
		HashSet<Character> hs1 = new HashSet<>(hs);
		hs1.add('U');
		hs1.add('B');

//		Print data using cursor iterator();
		Iterator<Character> itr = hs1.iterator();

		while (itr.hasNext()) {
			Character ch = itr.next();
			System.out.println(ch);
		}

	}

}
