package com.anisha.collectionfw.vector.oprations;

import java.util.Iterator;
import java.util.Vector;

public class RemoveOpration {

	public static void main(String[] args) {

//		Removing odd elements
		Vector<Integer> v = new Vector<>();
		for (int i = 0; i <= 30; i++) {
			v.add(i);
		}
		System.out.println(v);

		Iterator<Integer> itr = v.iterator();
		while (itr.hasNext()) {
			Integer num = itr.next();

			if (num % 2 == 0) {
				System.out.println(num);
			} else {
				itr.remove();
			}
		}

//          Examples : 1.remove(): removes based on object and also idx 
//          2.removeElement() : removes based on only object
		Vector<String> v2 = new Vector<>();
		v2.add("Anuu");
		v2.add("sanuu");

		v2.remove(1);
//          
		v2.removeElement("Anuu");
		System.out.println(v2);

		Vector<Integer> v3 = new Vector<>();

		v3.add(8);
		v3.add(5);

		v3.removeAll(v);
		System.out.println(v3);

	}

}
