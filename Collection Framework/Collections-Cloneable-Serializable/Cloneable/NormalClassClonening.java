package com.anisha.collections.clonening;

public class NormalClassClonening implements Cloneable {

	String name = "Anisha";
	int id = 31;
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
	 
		NormalClassClonening obj = new NormalClassClonening();
		System.out.println("Original Data: "+obj.name+" "+obj.id);
		
		NormalClassClonening copy = (NormalClassClonening)obj.clone();
		System.out.println("Copy of original data "+copy.name+" "+copy.id);
		
	}

}
