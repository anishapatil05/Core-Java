package com.anisha.eception.throwkeyword;

public class StringOprations {

	public String opration(String name) throws Exception {
		String value = name.toLowerCase();
		return value;
	}

	public int arrayOpration() throws Exception {
		int[] arr = { 8, 6, 8, 4, 2 };
		return arr[3];
	}

//	We are using throws then propagating that Exception to next method : but it is main method that's why it's going to JRE/JVM: & it throws Exception
	public static void main(String[] args) throws Exception {
		StringOprations str = new StringOprations();
		
//		You Are writing try-catch means you are handling that 
//		try {
//			System.out.println(str.opration("Its own logic: ANISHA"));
//			System.out.println(str.arrayOpration());
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

//		Propgating to JVM
		System.out.println(str.opration("Its own logic: ANISHA"));
		System.out.println(str.arrayOpration());
	}

}
