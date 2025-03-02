package com.anisha.strings;

class Test {

	Test(String s) {

	}
}

public class StringMethods {

//	Method 1 : equals()
	public static void main(String[] args) {

		Test t1 = new Test("neha");
		Test t2 = new Test("neha");

		System.out.println(t1.equals(t2)); // false ..bcz equals method is not overriding in Test class

//		In String already equals() is override
		String str = "anu";
		String str2 = "anu";
		System.out.println(str.equals(str2)); // t
		System.out.println(str == str2); // t

		String str3 = new String("panuu");
		String str4 = new String("panuu");

		System.out.println(str3.equals(str4)); // t
		System.out.println(str3 == str4); // f

		StringBuffer sb = new StringBuffer("neha");
		StringBuffer sb2 = new StringBuffer("janu");

		System.out.println(sb.equals(sb2)); // f
		System.out.println(sb == sb2); // f

	}

}
