package com.anisha.eception.throwkeyword;

public class StringOprationTwo {

	public static void main(String[] args) {
		StringOprations obj = new StringOprations();
		try {
			System.out.println(obj.opration("Another main method my logic: NISHA"));
			System.out.println(obj.arrayOpration());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
