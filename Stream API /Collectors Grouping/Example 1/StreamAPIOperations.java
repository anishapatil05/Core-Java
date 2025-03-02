package com.anisha.streamapi.grouping;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.anisha.streamapi.*;

public class StreamAPIOperations {

	public static void main(String[] args) {

		ArrayList<Employee> allEmployees = EmployeeDetails.infiOfAllEmp();

//		Get all Employess count based on joining year

		Map<Integer, Long> EmpCountbasedOnYear = allEmployees.stream()
				.collect(Collectors.groupingBy(e -> e.getJoiningYear(), Collectors.counting()));

		System.out.println(EmpCountbasedOnYear); // {2016=2, 2018=1, 2019=3, 2011=2, 2012=1}
		System.out.println();

// Get all count Employees based on gender 

		Map<Character, Long> EmpCountBasedOnGender = allEmployees.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));

		System.out.println(EmpCountBasedOnGender);

	}

}
