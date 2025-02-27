package com.anisha.strings;

public class StringObjectDemo {

	public static void main(String[] args) {

		String str1 = "anu";
		String str2 = "sanuu";
		String str3 = "anu";

//		Object Creation without using new operator
		System.out.println(str1 == str2); // False // == : Reference Comparasion
		System.out.println(str1 == str3); // true
		System.out.println(str2 == str3); // false

//		Object Creation with using new operator
		String s1 = new String("namu");
		String s2 = new String("janu");
		String s3 = new String("premu");

		System.out.println(s1 == s2); // f
		System.out.println(s2 == s3); // f
		System.out.println(s1 == s3); // f

//		Object creation using StringBuffer
		StringBuffer sb = new StringBuffer("neha");
		System.out.println(sb);

	}

}
