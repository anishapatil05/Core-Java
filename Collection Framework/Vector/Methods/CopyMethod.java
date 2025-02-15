package com.anisha.collectionfw.vector.oprations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class CopyMethod {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("10");
		v.add("20");
		v.add("30");
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Ten");
		al.add("Twenty");
		
		Collections.copy(v, al);
		System.out.println(v);             //[Ten, Twenty, 30]
  
	}

}
