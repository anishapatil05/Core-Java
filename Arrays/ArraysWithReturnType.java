package com.java.arrays;

public class ArraysWithReturnType {

	public static void main(String[] args) {
		
		ArraysWithReturnType obj = new ArraysWithReturnType();
		String name =obj.getName();
		
//		Printing Single name
        System.out.println(name); 
        
//        Printing set of names
        String[] names = obj.getNames();
        
        for(String n : names)
        System.out.println(n);
	}
	
//	only one value to be return 
	public String getName()
	{
		return "Anisha";
	}
	
//	Array for more than one return type
	public String[] getNames()
	{
		String[] names = {"anu","shreya"};
		return names;
	}

}
