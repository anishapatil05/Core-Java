package com.anisha.exception.demos;

public class Demo1 {

	public static void main(String[] args) {
		try {
			String name = "Anisha";
			System.out.println(name.charAt(9));

		} catch (Exception e) {

			System.out.println(e.getMessage()); // description only
			System.out.println(e.toString()); // toString() by default method : prints className & description
			e.printStackTrace(); // print complete stack trace of exception
		}

	}
}
