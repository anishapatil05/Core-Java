package com.anisha.abstractmc;

public class BookImpl extends BookTypes {

	public String book2() {
		return "AURORA";
	}

	public String book3() {
		return "BAGVITGITA";
	}

	public static void main(String[] args) {
		BookImpl obj = new BookImpl();
		obj.book1();
		System.out.println(obj.book2());
		System.out.println(obj.book3());

	}

}
