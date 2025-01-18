package com.anisha.encapsulation.example;

public class Employee {
    private int ID;
    private String name;
    private String password;
    
    public int getId()
    {
    	return this.ID;
    }
    public void setId(int newId)
    {
    	this.ID=newId;
    }
    
    public void sendToInfoEmpolyeeDetails()
    {        Employee employee = new  Employee();
            employee.ID=34;
            employee.name="anu";
            employee.password="anu@05";
            
            EmployeeDetails employeeDetils = new  EmployeeDetails();
            employeeDetils.getInfo(employee);	
    }
	
}
