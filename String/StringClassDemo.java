package com.anisha.strings;

public class StringClassDemo {

	public static void main(String[] args) {

//		Different way to intilize the String Class

//		case 1 :
		String str = "Anisha";
//		here you have create new String bcz Strings are immutable
		str = str.concat("hello"); // able to change references
		System.out.println(str); // Anishahello

//		case 2:
		str = new String("anuu");
		System.out.println(str); // anuu

//		Case 3 :

		char[] ch = { 'A', 'B', 'C', 'D', 'E', 'F' };
		String strCharArray = new String(ch);
		System.out.println(strCharArray); // ABCDEF

//		Case 4 :

		String newString = new String(ch, 2, 4);
		System.out.println(newString); // CDEF

//	     Case 5 :

		byte[] b = { 67, 68, 69, 70, 79 };
		String bytetoString = new String(b);
		System.out.println(bytetoString); // CDEFO

//	     Case 6 :

		bytetoString = new String(b, 2, 3);
		System.out.println(bytetoString); // EFO

	}

}
