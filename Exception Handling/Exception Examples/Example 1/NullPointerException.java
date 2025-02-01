package com.anisha.eception;

//Exmple of NullPointerException 
public class NullPointerException {

	public static void main(String[] args) {
	 String name=null;
	 
//	 java.lang.NullPointerException
	 System.out.println(name.charAt(5));
	 
	 System.out.println(name.toUpperCase());
	 
		
//		java.lang.NullPointerException
	 Employee emp = null;
	 emp.printInfo();
	 
	}

}
