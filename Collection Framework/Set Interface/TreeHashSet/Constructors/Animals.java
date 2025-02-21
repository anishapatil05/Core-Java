package com.anisha.collectionfw.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

// TreeSet Customized Sorting order : Desending Order
public class Animals {

	public static void main(String[] args) {
	
//		Constructor of TreeSet
		TreeSet<String> names = new TreeSet<String>(new MyComp());
		names.add("monky");
		names.add("donky");
		names.add("baffeloww");
		names.add("cat");
		
		System.out.println(names);
		
		
		TreeSet<Integer> nums = new TreeSet<Integer>(new integerComp());
		nums.add(3);
		nums.add(9);
		nums.add(4);
		nums.add(3);
		
		System.out.println(nums);

	}

}
class MyComp implements Comparator<String>{
	
	public int compare(String s1 , String s2) {
		return s2.compareTo(s1);
	}
}

class integerComp implements Comparator<Integer>{
	
	public int compare(Integer i1, Integer i2) {
		return i2.compareTo(i1);
	}
}