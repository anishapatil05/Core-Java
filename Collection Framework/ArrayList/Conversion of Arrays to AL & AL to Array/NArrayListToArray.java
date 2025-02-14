package com.anisha.collectionfw.demos;

import java.util.ArrayList;

//Conversion of normal ArrayList to Array
public class NArrayListToArray {

	public static void main(String[] args) {
		ArrayList names = new ArrayList<>();
		names.add("Anuu");
		names.add(6);
		names.add(7.7);

		Object[] o = names.toArray();
		for (Object oo : o) {
			System.out.println(oo);
		}

	}

}
