package com.anisha.string.stringBuffermethods;

public class StringBufferBasicMethods {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Anisha");

//		reverse()
		System.out.println(sb.reverse()); // ahsinA
		System.out.println(sb.charAt(2)); // i

//		delete() And deleteCharAt()

		StringBuffer sb1 = new StringBuffer("Shreysh");
		System.out.println(sb1.delete(1, 6)); // Sh
		System.out.println(sb1.deleteCharAt(0)); // h

//		append();
		StringBuffer sb2 = new StringBuffer("hii");
		sb2.append(" ");
		sb2.append("anisha");
		sb2.append(" ");
		sb2.append("your salary is ");
		int a = 30000;
		sb2.append(a);
		sb2.append(" ");

		System.out.println(sb2); // hii anisha your salary is 30000

//      insert()
		StringBuffer sb3 = new StringBuffer("anisha");
		sb3.insert(0, "hii");
		sb3.insert(3, " ");
		System.out.println(sb3); // hii anisha

//		replace()
		StringBuffer sb4 = new StringBuffer("how are you");
		sb4.replace(0, 3, "Who");
		System.out.println(sb4); // Who are you

	}

}
