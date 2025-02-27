package com.anisha.strings;

// String and StringBuffer both are final Classes
public class StringFeatures {

	public static void main(String[] args) {

//		String is immutable : modification cannot do be on exisiting object

		String str = "abuu";
		str.concat("is great");
		System.out.println(str); // abuu

//		.concat()  : it combines two String obj and create new String

		String str1 = str.concat(" is great");
		System.out.println(str1); // abuu is great

//		Immutable nature 
		String str2 = "anuu";
		str2 = str2.concat(" janu");
		System.out.println(str2); // anuu janu
		
//		Using new Operator
		String str6 = new String("janu");
		str6.concat("dil");
		System.out.println(str6);     //janu

//		StringBuffer are mutable : Modification is allowed on exsisting obj

		StringBuffer sb = new StringBuffer("neha");
		sb.append(" is great");
		System.out.println(sb); // neha is great
		
		

	}

}
