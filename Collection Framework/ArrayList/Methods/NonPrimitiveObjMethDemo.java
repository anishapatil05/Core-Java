package com.anisha.collectionfw.arrayList.demo;

import java.util.ArrayList;

// remove & removeAll
// contains & containsAll
//   retainsAll
public class NonPrimitiveObjMethDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Anisha", 111);
		Employee e2 = new Employee("Nisha", 222);
		Employee e3 = new Employee("Neha", 333);
		Employee e4 = new Employee("Apeksha", 444);
		
		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(e1);
		employee.add(e2);
		
		ArrayList<Employee> employee2 = new ArrayList<>();
		employee2.add(e3);
		employee2.add(e4);
		employee2.addAll(employee);
		
//		System.out.println(employee2.contains(e4));  //true
//		System.out.println(employee.containsAll(employee2));   //false
		
		employee2.retainAll(employee);    //remove data of emp2
	
//		employee2.remove(e3);  //("Anisha", 111),("Nisha", 222),("Apeksha", 444)
//		employee2.removeAll(employee); //("Apeksha", 444)
		
		for (Employee emp : employee2) {
			System.out.println(emp.eid + " " + emp.ename);
		}

		
		

	}

}
