package com.anisha.eceptionhandling.trycatch.blocks;

import java.io.File;
import java.io.FileReader;

// Exception Class Hirachy using catch block : Child -> Parent -> GrandParent
public class Demo4 {

	public static void main(String[] args) {
		try {
			int x = 10;
			int b = 20;

			double result = x / b;
			System.out.println(result);

//		   If exception come here then rest of the logic in the try block never executes 
			String name = "ANU";
			System.out.println(name.toLowerCase());

			int arr[] = { 78, 90, 76, 54, 2 };
			System.out.println(arr[3]);
			
			 File file = new File("non_existing_file.txt");
	         FileReader fr = new FileReader(file);
	          
		} catch (ArithmeticException e) {
			String reason = e.getMessage();
			System.out.println(reason);
		}
		catch (NullPointerException e) {
			String reason = e.getMessage();
			System.out.println(reason);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			String reason = e.getMessage();
			System.out.println(reason);
		}
//		if we take Exception type 1st then it produce Complie Time error
		catch(RuntimeException e)
		{
			String reason = e.getMessage();
			System.out.println(reason);
		}
		catch(Exception e)
		{
			String reason = e.getMessage();
			System.out.println(reason);
		}
		
		System.out.println("end of try-catch blocks");

	}

	

}
