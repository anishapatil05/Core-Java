package com.anisha.practiceex;

public class ReverseString {
// Reverse String 
	public static void main(String[] args) {
		
//		Apporach 1
		String str = "Anisha";

		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String revStr = sb.toString();
		System.out.println(revStr);
		System.out.println();
		
		
//		Apporach two
		String newStr="";
		for(int i=str.length()-1; i>=0; i--) {
			
			newStr += str.charAt(i);
			
		}
		System.out.println(newStr);
	}

}
