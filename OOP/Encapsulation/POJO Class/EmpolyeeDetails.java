package com.anisha.pojo;

public class EmpolyeeDetails {

	public Empolyee sendDataTo() {
		Empolyee empolyee = new Empolyee();
		empolyee.setName("Anisha");
		empolyee.setId(5);
		empolyee.setDepartment("Devlopment");
		empolyee.setSalary(25000.0);

		return empolyee;

	}

	public void reciveDataFrom() {
		Empolyee emp = sendDataTo();

		EmployeeFinalInfo obj = new EmployeeFinalInfo();
		obj.empDtails(emp);
	}

	public static void main(String[] args) {
		EmpolyeeDetails obj = new EmpolyeeDetails();
		obj.reciveDataFrom();

	}

}
