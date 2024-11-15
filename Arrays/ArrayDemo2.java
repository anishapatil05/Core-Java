package com.java.arrays;

/*How to initialize an array: 1. Array Literal
                              2. Array initialization  */
public class ArrayDemo2 {

	public static void main(String[] args) {
		int values[] = new int[6];

//      defining ony 5th index as 9;
		values[3] = 9;

//          printing the array 
//          for each loop .....
		for (int i : values) {
			System.out.println(i);
		}
		
//	    String data-type for array inialization
		String names[] = new String[5];
		
		names[2]="Anisha";
		for(String name : names)
		{
			System.out.println(name);
		}
		
    }

}
