package com.anisha.collectionfw.set.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetOprations {

	public static void main(String[] args) {
		TreeSet<Integer> values = new TreeSet<Integer>();
		values.add(10);
		values.add(70);
		values.add(30);
		values.add(90);
		values.add(60);

		System.out.println(values); // [10, 30, 60, 70, 90]

		System.out.println("First Element: " + values.first()); // 10
		System.out.println("Last Element: " + values.last()); // 90

		System.out.println("Lower Element" + values.lower(30)); // 10;
		System.out.println("Higher Element " + values.higher(60)); // 70

		SortedSet<Integer> newSet = values.subSet(30, 90); // 30,60,70
		System.out.println("subSet " + newSet);

		System.out.println("HeadSet " + values.headSet(30)); // 10
		System.out.println("Tailset " + values.tailSet(60)); // 60,70,90

		System.out.println("First removel element " + values.pollFirst()); // 10
		System.out.println("Last removel element " + values.pollLast()); // 90

		System.out.println(values);
		System.out.println(values.isEmpty()); // false
		values.clear();
		System.out.println(values.isEmpty()); // true

	}

}
