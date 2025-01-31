package com.anisha.functional.Interface.lambdaexp;

import java.util.*;

public class EmailNotificationSystem {

	public static void main(String[] args) {
		System.out.println("Choose one : 1.Gmail Service, 2.*Outlook Service, 3.Sheduled Emails");

		EmailServices services = null;
		Scanner sc = new Scanner(System.in);
		int choise = sc.nextInt();
		switch (choise) {
		case 1:
			services = (recipients, subject, message) -> {
				System.out.println("***Gmail Service****");
				System.out.println("Sending mail to: " + recipients);
				System.out.println("Subject: " + subject);
				System.out.println("message: " + message);
			};
			break;

		case 2:
			services = (recipients, subject, message) -> {
				System.out.println("***Outlook Service****");
				System.out.println("Sending mail to: " + recipients);
				System.out.println("Subject: " + subject);
				System.out.println("message: " + message);
			};
			break;

		case 3:
			services = (recipients, subject, message) -> {
				System.out.println("*****Sheduled Emails****");
				System.out.println("After 5 sec");
				System.out.println("Sending mail to: " + recipients);
				System.out.println("Subject: " + subject);
				System.out.println("message: " + message);

			};

		default:
			System.out.println("choose correct option");

		}
		if (services != null) {
			services.emailTypes("anisha@1234", "Reminder", "Your balance is expiring soon");
		}

	}

}
