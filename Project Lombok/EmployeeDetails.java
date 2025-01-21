package com.anisha.lombok;

import java.time.LocalDate;

public class EmployeeDetails {

	public static void main(String[] args) {
		Empolyee details = new Empolyee("Anisha", 1200, "Web", 4, 'F', 21, LocalDate.of(2025, 1, 21));
		System.out.println(details);
	}

}
