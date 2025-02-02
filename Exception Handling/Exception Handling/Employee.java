package com.anisha.exception.typesofexception;

import java.io.File;
import java.io.FileReader;

import javax.imageio.stream.FileImageInputStream;

public class Employee {

	public static void main(String[] args) {

//		Complie Time Eception 
//		 File file = new File("non_existing_file.txt");
//         FileReader fr = new FileReader(file);

//		Runtime Exception : Discover at exeuction time
		try {
			String name = null;
			System.out.println(name.toUpperCase());
		} catch (NullPointerException exp) {
			System.out.println(exp);
			System.out.println("Enter the String name value...");
		}

	}

}
