package com.anisha.collectionfw.demo;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.Size2DSyntax;

public class Example {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Anisha");
		names.add("Nisha");
		names.add("Apeksha");
		names.add("Siddhant");
		names.add("Shreyash");
		names.add("Abhishek");
		names.add("Aruna");
		names.add("Avinash");
		names.add("Aniket");
		names.add("Alia");
		
		System.out.println(names.size());
		
//		Get 1 st 5 values i  the arraylist using loop
		
		for(int i=0; i<= 5 && i<=names.size()-1; i++)
		{
			System.out.println(names.get(i));
		}
		System.out.println();
//		reverse order
	       List<String>  revOrder = names.reversed();
		System.out.println(revOrder);
		
		Object[] arr = revOrder.toArray();
		for(Object values : arr) {
			System.out.println((String) values);
		}
		
		System.out.println();
		
//		alternative index values
		for(int i=0; i<= names.size()-1; i=i+2)
		{
			System.out.println(names.get(i));
		}
	}

}
