package com.anisha.iostreams.filedirgenration;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

//		Genrating file
		File file = new File("anisha.txt");
		boolean newFile = file.createNewFile();

		if (newFile) {
			System.out.println("File is successfully created");
		} else {
			System.out.println("file is already exsited");
		}
		System.out.println("After creation " + file.exists());
		
//		Genrating directory
		File f= new File("ANISHA");
		boolean status = f.mkdir();
		if(status) {
		System.out.println("Directory is successfully created");
		}else {
			System.out.println("Directory already existed");
		}
		
//		Genrating file inside directory 
		File f2 = new File("ANISHA","abhi.txt");
		f2.createNewFile();
		System.out.println("File is creted inside directory successfully..");
	}

}
