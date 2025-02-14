package com.anisha.collectionfw.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorOpration {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Anisha");
		al.add("anuu");
		al.add("shreya");
		al.add("shreyash");

//        Req : 1.remove anuuu  , 2. add "Siddhant" , 3.replace shreyash with shayuu

		ListIterator<String> itr = al.listIterator();
		itr.add("Siddhant");
		while (itr.hasNext()) {
			String str = itr.next();
			if (str.equals("anuu")) {
				itr.remove();
			}

		}

		for (String str : al) {
			System.out.println(str);
		}
	}

}
