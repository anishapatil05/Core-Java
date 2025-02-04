package com.anisha.exception.tryCatchFinally;

public class Product {
	
	

	public static void main(String[] args) {
		
           try {
        	   System.out.println("This is try block");
        	   String name =null;
        	   System.out.println(name.toLowerCase());
        	   
           }catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("This is catch block");
		}
           finally {
        	   System.out.println("this is finally block");
           }
	}

}
