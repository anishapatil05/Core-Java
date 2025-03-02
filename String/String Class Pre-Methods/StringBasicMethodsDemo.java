package com.anisha.strings.stringmethods;

public class StringBasicMethodsDemo {

	public static void main(String[] args) {

		String str = "Anisha";
		System.out.println(str.length()); // 6
		System.out.println(str.charAt(1)); // n
		System.out.println(str.indexOf('s')); // 3

//		split()  : it split the String or speces in the String
		String str2 = "  hii anisha how are you  ";
		String[] s = str2.split(" ");

		for (String ss : s) {
			System.out.println(ss);
		}

//	     Method Chaning -> trim(),substring(),length()
		System.out.println(str2.trim());
		System.out.println(str2.substring(6, 12).length()); // 6
		System.out.println(str2.substring(2).lastIndexOf('a')); // 15

//		contains()
		System.out.println(str2.contains("an")); // true
		System.out.println(str2.contains("api")); // false

//		replace()
		String str3 = "hii anuuu";
		System.out.println(str3.replace('h', 'o')); // oii anuuu
		System.out.println(str3.replaceAll("anuuu", "danuu")); // hii danuu

//		toUpperCase() And toLowerCase()
		String str4 = "neha";
		System.out.println(str4.toUpperCase()); // NEHA

		String str5 = "ANISHA";
		System.out.println(str5.toLowerCase()); // anisha

		String str6 = "hii HOW are You";
		System.out.println("HOW".toLowerCase()); // how
		System.out.println(str6.charAt(2)); // i
		System.out.println(str6.toUpperCase()); // HII HOW ARE YOU
		System.out.println("are".toLowerCase()); // are

//		startsWith() And endsWith()
		String str7 = "hii my name is anisha";
		System.out.println(str7.startsWith("hii")); // true
		System.out.println(str7.startsWith("my")); // false
		System.out.println(str7.endsWith("anu")); // false
		System.out.println(str7.endsWith("anisha")); // true

	}

}
