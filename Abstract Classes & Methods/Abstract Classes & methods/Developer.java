package com.anisha.abstractmc;

public class Developer extends Manager {

	public void getDetails() {
		System.out.println(
				"name of employee: " + NAME + "Salary of employee: " + SALARY + "department is: " + DEPARTMENT);
	}

	public void updateDetails() {

		System.out.println("Salary of employee is updated ");

	}

	public static void main(String[] args) {
		Developer obj = new Developer();
		obj.work();
		obj.conductMeeting();
		obj.getDetails();
		obj.updateDetails();

	}

}
