package com.anisha.nestedclasses.normalinnerclass;


//Nested Classes : 1.Normal Inner Class
public class Outer4 {

	Outer4() 
	{
		System.out.println("Outer4 Cons");
	}

	{
		System.out.println("Outer4 Instance block");

	}
	static
	{
		System.out.println("Outer4 static block");
	}

	class Inner {

		public Inner() 
		{
			System.out.println("Inner class cons");
		}

		{
			System.out.println("Inner class Instance block");
		}
		static 
		{
			System.out.println("Inner static block");
		}

	}

	public static void main(String[] args) {
		new Outer4().new Inner();

//		OUTPUT
		/*
		 * Outer4 static block Inner static block Outer4 Instance block Outer4 Cons
		 * Inner class Instance block Inner class cons
		 */

	}

}
