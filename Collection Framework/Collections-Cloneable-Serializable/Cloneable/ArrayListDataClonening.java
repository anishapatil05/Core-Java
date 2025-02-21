package com.anisha.collections.clonening;

import java.util.ArrayList;

public class ArrayListDataClonening {

	public static void main(String[] args) {
	
		ArrayList<String> names = new ArrayList<>();
		names.add("anuu");
		names.add("sanuu");
		names.add("neha");
		names.add("priti");
		
		System.out.println("Original Data "+names);
		
		ArrayList<String> newList = (ArrayList<String>)names.clone();
		System.out.println("Duplicate data "+newList);

	}

}
