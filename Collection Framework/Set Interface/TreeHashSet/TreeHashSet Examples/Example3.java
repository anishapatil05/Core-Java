package com.anisha.collectionfw.set.treeset.examples;

import java.util.SortedSet;
import java.util.TreeSet;

public class Example3 {

//	passing sorted object to TreeSet Constructor
	public static void main(String[] args) {
	
		TreeSet<Integer> tt = new TreeSet<Integer>();
		tt.add(8);
		tt.add(5);
		tt.add(3);
		tt.add(0);
		
		System.out.println(tt);  //[0, 3, 5, 8]
		
		SortedSet< Integer> newSortedSet = tt.headSet(8);
		TreeSet<Integer> values = new TreeSet<Integer>(newSortedSet);
		System.out.println("HeadSet "+values); // 0,3,5

		
		SortedSet< Integer> newTailSet = tt.tailSet(3);
		TreeSet<Integer>nums= new TreeSet<Integer>(newTailSet);
		System.out.println("TailSet "+nums); //[3, 5, 8]
	}

}
