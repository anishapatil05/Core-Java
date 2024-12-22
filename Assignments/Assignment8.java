package com.java.arrays;

// Arrays with method operations : 1.Array as a return type
public class Assignment8 {

	public static void main(String[] args) {
		Assignment8  obj = new Assignment8();
		
//		Printing all type of values
		 int[] ages = obj.getAges();
		 for(int a : ages)
		 {
			 System.out.println(a);
		 }
		 
		 double[] marks = obj.getMarks();
		 for(double m : marks)
		 {
			 System.out.println(m);
		 }
		 
		 long[] mobile = obj.getMobileNum();
		 for(long p : mobile)
		 {
			 System.out.println(p);
		 }
		 
		 char[] gender = obj.getGender();
		 for(char c : gender)
		 {
			 System.out.println(c);
		 }

	}
	
//	creating int type array 
	public int[] getAges()
	{
		int[] ages = {22,34,32,13};
		return ages;
	}
	
//	creating double type array
	public double[] getMarks()
	{
		double[] marks = {222,543,678,32};
		return marks;
		
	}
	
//	creating long tyep array
	public long[] getMobileNum()
	{
		long[] mobile= {111111111l,222222222l};
		return mobile;
	}
	
//	creating char type array
	public char[] getGender()
	{
		char[] gender = {'M','F'};
		return gender;
	}

}
