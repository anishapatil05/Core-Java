package com.anisha.nestedclassanonymous;

import java.util.HashSet;

// Anonymous inner class : HashSet
public class Outer3 {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>() {

			public boolean add(Integer e) {
				System.out.println("Adding Element " + e);
				return super.add(e);
			}

		};

		set.add(6);
		set.add(8);
		set.add(null);

	}

}
