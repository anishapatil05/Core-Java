package com.anisha.collectionfw.demos;

import java.util.ArrayList;
import java.util.Arrays;

// Conversion : Arrays to ArrayList
public class ArrayToArrayList {

	public static void main(String[] args) {

//		Creating int type array
		String[] names = { "Anisha", "Shreyash" };
//		Creating Integer type ArrayList
		ArrayList<String> al = new ArrayList<>(Arrays.asList(names));
		al.add("Anuu");
		al.add("Apeksha");

		System.out.println(al);

	}

}
