package com.anisha.strings;

public class EmployeeDetails {

	public static void main(String[] args) {
	
		Employee e1 = new Employee("anu", 111, 89000);
		
//		Without overriding toString()
		System.out.println(e1);
		System.out.println(e1.toString());        //classname@hashcode
		
//		Overriding toString()
		System.out.println(e1);
		
//		String class internally overrides toString()
		String str = new String("anuu");
		System.out.println(str);           //anuu
		
//		StringBuffer class  internally overrides toString()
		StringBuffer sb = new StringBuffer("januu");
		System.out.println(sb);      //januu
		

	}

}
