package com.anisha.collectionfw.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethodsDemo {

	public static void main(String[] args) {
		ArrayList<Character> letters = new ArrayList<>();
		letters.add('A');
		letters.add('B');
		letters.add('C');
		letters.add('D');
		letters.add('A');
		
		System.out.println(letters.size());   //5
		System.out.println(letters.get(2));   //c
		
		letters.add(2, 'F');
		System.out.println(letters);  //[A,B,F,C,D,A];
		
		letters.addFirst('K');
		System.out.println(letters);  // [K,A,B,F,C,D,A]
 
		letters.add('G');
		System.out.println(letters);  //[K,A,B,F,C,D,A,G]
		
		ArrayList<Character> letters2 = new ArrayList<>();
		letters2.add('D');
		letters2.add('Y');
		letters2.add('I');
		letters2.add('O');
		letters2.add('P');
		letters2.add('A');
		
		for(char values : letters2) {
			System.out.println(values);   //[D,Y,I,O,P,A];
		}
		
//		Searching
		boolean Char = letters2.contains('O');
		System.out.println(Char);   //true
		
		Char =letters.containsAll(letters2);
		System.out.println(Char);   //false
		
		
//		returing duplicate from letters2 comapring to letters
		letters.retainAll(letters2);
		System.out.println(letters);      //[D,A,A];
		
//		getting unique values
		letters2.removeAll(letters);
		System.out.println(letters2);        // [Y,I,O,P]
		
//		SubList
		List<Character> newList =letters2.subList(1, 3);
		System.out.println(newList);       //[I,O];
		
//		convert to Array
		Object[] arr = newList.toArray();
		for(Object eme : arr) {
			System.out.println((Character)eme);    //[I,O];
			
		}
		
		 System.out.println(newList.isEmpty());      //false
		
	     System.out.println(newList.indexOf('I'));      // 0
	     
	     
	       letters2.addAll(newList);  
		System.out.println(letters2);   //[Y,I,O,P,I,O]
		
//		Itrator
		Iterator<Character>itr =letters2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());    //[Y,I,O,P,I,O]
		}                    
		
		letters2.remove(2);   //[Y,I,P,I,O]
		System.out.println(letters2);
		
		 letters2.remove(Character.valueOf('P'));
		System.out.println(letters2);            //[Y,I,I,O];
		
		
		
		
	}

}
