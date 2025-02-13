package com.anisha.collectionfw.arrayList.demo;

import java.util.ArrayList;

public class MethodAddandAddAll {

	public static void main(String[] args) {
	
		Employee e1 = new Employee("Anisha", 111);
		Employee e2 = new Employee("Nisha", 222);
		
		ArrayList<Employee> employee = new ArrayList<>();
		
		 employee.add(e1);
		 employee.add(e2);
		 
		 ArrayList<Employee> employee2 = new ArrayList<>();
		  employee2.add(new Employee("Shreyash", 333));
		 
//		  REQURIMENT : aading employee & employee2 in employee3
			 ArrayList<Employee> employee3 = new ArrayList<>();
			 employee3.addAll(employee);      //("Anisha", 111); ("Nisha", 222),
			 employee3.addAll(employee2);      //("Shreyash", 333
			 
//			 Adding onle one object 
			 employee3.add(new Employee("Abhi", 6));    //("Abhi", 6)
			 
			 for(Employee emp : employee3) {
				 System.out.println(emp.eid+" "+emp.ename);
			 }
		

	}

}
