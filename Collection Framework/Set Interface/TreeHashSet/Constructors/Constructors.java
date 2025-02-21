package com.anisha.collectionfw.set.treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Constructors {

	public static void main(String[] args) {

//		Constructor 1 : Default Constructor
		TreeSet<String> names = new TreeSet<>();
		names.add("anuu");
		names.add("sanuu");
		names.add("prema");
		names.add("sharaddha");

		System.out.println(names); // [anuu, prema, sanuu, sharaddha]

//		Constructor 2 : Adding cone coolection data to another
		TreeSet<String> values = new TreeSet<>(names);
		values.add("aapu");
		values.add("prema");
		System.out.println(values); // [aapu, anuu, prema, sanuu, sharaddha]

//		Constructor 3 : Customization or Sorting
		TreeSet<Character> alpahas = new TreeSet<Character>(new charctersComp());
		alpahas.add('A');
		alpahas.add('B');
		alpahas.add('E');
		alpahas.add('P');

		System.out.println(alpahas);

//		Constructor 4 : Sorted Subset

		TreeSet<Integer> nums = new TreeSet<Integer>();

		for (int i = 0; i <= 20; i++) {

			if (i % 2 == 0)
				nums.add(i);
		}
		System.out.println(nums);

		SortedSet<Integer> ss = nums.subSet(10, 15);
		TreeSet<Integer> newTreeSet = new TreeSet<Integer>(ss);
		System.out.println(newTreeSet);

	}

}

//Constructor 3 : Customization or Sorting
class charctersComp implements Comparator<Character> {

	public int compare(Character c1, Character c2) {
//		return -1;     [P, E, B, A] (Reverse Order : Desending Order)

//		return 1;      [A, B, E, P]   (Assending Order)

//		return 0; // [A]
		
//		return -c2.compareTo(c1);    //[A, B, E, P]   (Assending Order)
		return -c1.compareTo(c2);        // [P, E, B, A] (Reverse Order : Desending Order)
		
	}
}
