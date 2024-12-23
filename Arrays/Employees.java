package com.java.arrays;

import java.util.Scanner;

// Addining object in to array & printing them 
public class Employees {
	
	public int id;
	public String name;
	
	public Employees(int sid, String sname)
	{
		id=sid;
		name=sname;
	}

	public static void main(String[] args) {
		int[] arr = new int[4];
		 arr[1] = 90;
		 for(int a : arr)
		 {
			 System.out.println(a);
		 }
		 Employees e1 = new Employees(111,"three");
		 Employees e2 = new Employees(3, "anu");
		 Employees e3 = new Employees(4,"shreyash");
		 
		 Employees[] employee = new Employees[3];
		 employee[0] = e1;
		 employee[1] = e2;
		 employee[2] = e3;
		 
		 for(Employees e : employee)
		 {
			 System.out.println(e.id);
			 System.out.println(e.name);
		 }
		 
//		 Taking Dynamic input of array from user
		 
		 int[] a = new int[3];
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter values");
		 for(int i=0; i<= a.length-1; i++)
		 {
			  System.out.println("enter value at index: "+i);
			 a[i] = sc.nextInt();
			 
		 }
		 for(int e : a)
		 {
			 System.out.print(e);
		 }
		 
//		 Sum of array elements
		 
		 int Sum[] = {12,34,56,78};
		 int sum =0;
		 for(int i =0; i<Sum.length; i++)
		 {
			 sum = sum+Sum[i];
		 }
		 System.out.println("the sum of array elements is: "+sum);
		
//		 Finding Maximum and Minimum element in the array
		 
		 int k[]= {10,20,5,70,9};
		 
//		 Finding Maximum value
		 int Max = Integer.MIN_VALUE;
		 for(int i=0; i<k.length; i++)
		 {
			 if(Max < k[i])
			 {
				 Max = k[i];
			 } 
		 }
		 System.out.println("Maximum: "+Max );
		 
//		 Findining min value
		 int Min = Integer.MAX_VALUE;
		 for(int i=0; i<k.length; i++)
		 {
			 if(Min> k[i])
			 {
				 Min= k[i];
			 }
		 }
		 
		 System.out.println("Minimum: "+Min);
		 
//		 Copy the data from one array to another array
		 int copyfrom[] = {12,11,10,19,19};
		 int copyto[] =new int[4];
		 
		 System.arraycopy(copyfrom,1 , copyto, 0,4);
		 
		 for(int c : copyto)
		 {
			 System.out.println(c);
		 }
		 
//		 Copy the data from one array to another array
		 
		 int[] newarray = java.util.Arrays.copyOfRange(copyfrom, 1, 4);
		 for(int b : newarray)
		 {
			 System.out.println(b);
		 }		
		 
//		 Finding Null index in the array
		 int d[] = new int[4];
		 d[1]=8;
		 d[3]=9;
		 
		 for(int i=0; i<arr.length; i++)
		 {
			 if(d[i] == 0)
			 {
				 System.out.println(i);
			 }
		 }
		 
//		 To get the class name of the array
		 int h[] = {10,20,30};
		 System.out.println(a.getClass().getName());
		 
//		 Multidimestional Array 
		 int[][] Marr = {{10,20,30},{40,50,60}};
		 System.out.println(Marr[0][0]);
		 System.out.println(Marr[0][1]);
         System.out.println(Marr[0][2]);		 
   }

}
