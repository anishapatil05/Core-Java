package com.anisha.collectionfw.setInterface;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
	
//		Primitive Data Type 
		HashSet<String> names	 = new HashSet<String>();
		names.add("Anisha");
		names.add("saniya");
		names.add("shraddha");
		names.add("Apeksha");
//		overrided
		names.add("Anisha");
		
		System.out.println(names.size());
		System.out.println(names);
		
		HashSet<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(8);
		nums.add(3);
		nums.add(8);
		
		System.out.println(nums.size());  //4
		System.out.println(nums);   //[1, 2, 3, 8]
		
		nums.add(9);
		nums.remove(2);  
		System.out.println(nums);
	}

}
