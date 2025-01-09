package com.anisha.abstractmc;

public abstract class Manager implements Employee {

	public void work() {
		System.out.println(" planning, organizing, leading, and controlling resources");
	}

	public void conductMeeting() {
		System.out.println(NAME + " is conducting meeting ");
		System.out.println("Dissucss details of project and assign task");
	}

}
