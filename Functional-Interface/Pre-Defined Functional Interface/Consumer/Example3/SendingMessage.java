package com.anisha.consumer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;



public class SendingMessage {

	public static void main(String[] args) {

		ArrayList<EmployeeEmail> data = new ArrayList<>();
		data.add(new EmployeeEmail("Shreyash", "shreyashpatil@05"));
		data.add(new EmployeeEmail("Anisha", "anishapatil@0520"));
		data.add(new EmployeeEmail("Keshav", "keshvpatanker@0590"));

//        REQ : Sending "Welcome" message to new Employess

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email");

		String useremail = sc.next();

		Consumer<EmployeeEmail> meassge = emp -> {
			if (emp.emailId.equals(useremail)) {
				System.out.println("Welcome to our company.." + emp.name + " !");
			}

		};

		boolean emailFound = false;

		for (EmployeeEmail e : data) {
			meassge.accept(e);

			if (e.emailId.equals(useremail)) {
				emailFound = true;
				break;
			}
		}

		if (!emailFound) {
			System.out.println("Enter correct emailId");

		}

	}
}
