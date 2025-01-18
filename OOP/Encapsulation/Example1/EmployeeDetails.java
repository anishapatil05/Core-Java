package com.anisha.encapsulation.example;

public class EmployeeDetails {
	
	public void getInfo(Employee emp)
	{
//		reading
       emp.getId();
       System.out.println("read: "+emp.getId());
       
//       udating
       emp.setId(8);
       System.out.println("updating "+emp.getId());
	}
	

	public static void main(String[] args) {
		Employee obj = new  Employee();
		obj.sendToInfoEmpolyeeDetails();

	}

}
