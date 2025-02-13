package com.anisha.collectionfw.arrayList.demo;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		Employee e1 = new Employee("Anisha", 111);
		Employee e2 = new Employee("Nisha", 222);
		Employee e3 = new Employee("Apeksha", 333);
		Employee e4 = new Employee("Abhishek", 444);
		
		
	ArrayList<Employee> employee = new ArrayList<>();
	
	     employee.add(e1);           //("Anisha", 111);
	     employee.add(e2);           //("Nisha", 222);
	     
	     ArrayList<Employee> employee2 = new ArrayList<>();
	     employee2.addAll(employee);      //("Anisha", 111);,("Nisha", 222); 
	     employee2.add(e3);                //  ("Apeksha", 333);
	     employee2.add(e4);                //("Abhishek", 444);
	     
	     
	     System.out.println(employee2.contains(e1));           //true
	     System.out.println(employee2.containsAll(employee));   //true
	     
	     employee2.remove(e1);                  
	     System.out.println(employee2.contains(e1));     //false
	     System.out.println(employee2.containsAll(employee));  //false  
	      
	}

}
