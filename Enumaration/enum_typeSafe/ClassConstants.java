package com.anisha.enumeration.typesafty;

public class ClassConstants {

	public static void ClassConstantsDemo(int a) {

		if (ClassMail.INBOX == a) {
			System.out.println("Mail inbox operation");
		} else if (ClassMail.COMPOSE == a) {
			System.out.println("Mail Compose operation");
		} else {
			System.out.println("Mail Sent operation");
		}

	}

	public static void enumConstants(EnumMail e) {

		if (EnumMail.INBOX == e) {
			System.out.println("Mail Inbox operation");
		} else if (EnumMail.COMPOSE == e) {
			System.out.println("Mail Compose operation");
		} else {
			System.out.println("Sent operation");
		}
	}

	// no Type safty we can pass any value
	public static void main(String[] args) {
		ClassConstantsDemo(8);
		ClassConstantsDemo(1);
		ClassConstantsDemo(2);
		System.out.println();

		
 // Type safty is strictly followed otherwise it gives Compile time error
		enumConstants(EnumMail.COMPOSE);
		enumConstants(EnumMail.INBOX);
		enumConstants(EnumMail.SENT);

	}

}
