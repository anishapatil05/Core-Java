package com.anisha.strings.conversionprocess;

public class ConversionClassDemo {

	public static void main(String[] args) {

//		Conversion of String to StringBuffer
		String str = "anisha";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		
//		Conversion of StringBuffer to String
		
		StringBuffer sb1 = new StringBuffer("anuuu");
		String str2 = sb1.toString();
		System.out.println(str2);
		

	}

}
