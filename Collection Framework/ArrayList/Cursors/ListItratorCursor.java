package com.anisha.collectionfw.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItratorCursor {

	public static void main(String[] args) {
	         ArrayList al = new ArrayList<>();
	         al.add("Anisha");
	         al.add("anuu");
	         al.add("shreya");
	         
//	         Creating ListItrator Obj 
	         
//Apporach 1 : Read data by normal version in forword direction using ListItrator Cursor
	         ListIterator listIt =  al.listIterator();
	         
	         while(listIt.hasNext()) {
	        	 String str = (String) listIt.next();
	        	 System.out.println(str);
	         }
	         
//	   Read data by normal version in backword direction using ListItrator Cursor
	         while(listIt.hasPrevious()) {
	        	 String str = (String) listIt.previous();
	        	 System.out.println(str);
	         }
	         
	         System.out.println();
	       //Apporach 2 : Read data by Generic version in forword direction using ListItrator Cursor
	         ArrayList<Integer> al2 = new ArrayList<>();
	         al2.add(1);
	         al2.add(3);
	         al2.add(4);
	         
	         ListIterator<Integer> listIt2 =  al2.listIterator();
	         
	         while(listIt2.hasNext()) {
	        	Integer num = (Integer) listIt2.next();
	        	 System.out.println(num);
	         }
	         
//	   Read data by Generic  version in backword direction using ListItrator Cursor
	         while(listIt2.hasPrevious()) {
	        	System.out.println(listIt2.previous());
	         }
	         

	         

	}

}
