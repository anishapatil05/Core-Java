package com.anisha.collectionfw.cursors;

import java.util.Iterator;
import java.util.Vector;

// ItratorCursor : To read the data from leagacy classes
public class ItratorCursor {

	public static void main(String[] args) {

//		leagcy class : vector
		Vector<String> v = new Vector<String>();
		v.add("Anisha");
		v.add("Shreyash");
		v.add("Apeksha");
		v.add("Siddhant");

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

//	    Approach 3: Noraml version of read the data from collection using ItratorCursor
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str);
		}

//	    Approach 4:Generic version of read the data from collection using ItratorCursor
		Iterator<String> itr1 = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		

	}

}
