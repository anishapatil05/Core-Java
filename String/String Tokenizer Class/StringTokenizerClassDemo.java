package com.anisha.string.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerClassDemo {

	public static void main(String[] args) {

		StringTokenizer strtoken = new StringTokenizer("hii anisha how are you");

		while (strtoken.hasMoreTokens()) {
			String str = strtoken.nextToken();
			System.out.println(str); // by default it removes spaces
		}

		System.out.println();

//		In below it removes , and move to nextLine
		StringTokenizer strtoken2 = new StringTokenizer("hii anis,ha ,how ,are you", ",");

		while (strtoken2.hasMoreTokens()) {
			String str = strtoken2.nextToken();
			System.out.println(str);
		}

	}

}
