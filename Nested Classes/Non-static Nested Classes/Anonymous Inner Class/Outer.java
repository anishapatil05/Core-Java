package com.anisha.nestedclassanonymous;

import java.util.ArrayList;
// Anonymous inner class

// Predefined class : ArrayList
public class Outer {

	ArrayList<Integer> list = new ArrayList<>() {
		public boolean add(Integer e) {
			System.out.println("Adding element " + e);
			return super.add(e);
		}

	};

	public static void main(String[] args) {
		Outer o = new Outer();
		o.list.add(0);
		o.list.add(5);
	}

}
