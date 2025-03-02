package com.anisha.strings.methods;

public class EqualsAndCompareToDiffDemo {

	public static void main(String[] args) {
	
//		equals() Method
		String str = "anuu";
		String str2 = "danuu";
		String str3 = "anuu";
		String str4 = "ANUU";
		
		System.out.println(str.equals(str3));      //true
		System.out.println(str.equals(str2));      //false
		System.out.println(str2.equals(str3));     //false
		System.out.println(str.equals(str4));      //false
		System.out.println(str.equalsIgnoreCase(str4));  //true
		
//		CompareTo() Method
		
		String s = "Anisha";
		String s1 = "Dansri";
		String s2 = "anisha";
		String s3 = "dansri";
		
		System.out.println(s.compareTo(s1));  //-ve 
		System.out.println(s1.compareTo(s));  //+ve
		System.out.println(s1.compareTo(s3)); //-ve
		System.out.println(s1.compareToIgnoreCase(s3));    //0
		
		System.out.println(s2.compareTo(s));  //+ve
		
		
		

	}

}
