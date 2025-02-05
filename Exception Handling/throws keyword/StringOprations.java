package com.anisha.eception.throwkeyword;

public class StringOprations {

	public String opration(String name) throws Exception {
		String value = name.toLowerCase();
		return value;
	}

	public int arrayOpration() {
		int[] arr = { 8, 6, 8, 4, 2 };
		return arr[3];
	}

	public static void main(String[] args) {
		StringOprations str = new StringOprations();
		try {
			System.out.println(str.opration("Its own logic: ANISHA"));
			System.out.println(str.arrayOpration());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
