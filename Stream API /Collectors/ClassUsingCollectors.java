package com.anisha.streamapi.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.anisha.streamapi.*;

public class ClassUsingCollectors {

	public static void main(String[] args) {

		ArrayList<Employee> allEmployees = EmployeeDetails.infiOfAllEmp();

//		List Class using Collectors
//		REQ : get all female employee list from above list
		List<Employee> femaleEmp = allEmployees
				.stream()
				.filter(e -> e.getGender() == 'F')
				.toList();
                 System.out.println(femaleEmp);

//		Set class using Collectors 
//	    REQ :   get all Employee id's set as a having salary is 20000

		Set<Integer> id = allEmployees
				.stream()
				.filter(e -> e.getSalary() > 20000)
				.map(e -> e.getId())
				.collect(Collectors.toSet());
		         id.forEach(e -> System.out.println(e));

//		Map class using Collectors
//		REQ : print employee id and name

		Map<String, Integer> selectEmployee = allEmployees
				.stream()
				.collect(Collectors.toMap(e -> e.getName(), e -> e.getId()));
		         System.out.println(selectEmployee);

//		REQ : print all female employees  

		Map<String, Double> empIdAndSalary = allEmployees
				.stream()
				.filter(e -> e.getGender() == 'F')
				.collect(Collectors.toMap(e -> e.getName(), e -> e.getSalary()));
		         System.out.println(empIdAndSalary);
		         
//		 		REQ : print all male employees id and salary
		     	Map<String, Double> maleEmp = allEmployees
						.stream()
						.filter(e -> e.getGender() == 'M')
						.collect(Collectors.toMap(e -> e.getName(), e -> e.getSalary()));
				         System.out.println( maleEmp); 
		       

	}

}
