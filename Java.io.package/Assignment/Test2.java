package com.anisha.iostreams.assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {

		// Observation 2 : Create directory inside that create file and write some data

//		Task 1 : Directory is created : Apeksha
//		Task 2 : File is created : aapu.txt
//		Task 3 : add some content inside file : hello apeksha;

		File file = new File("Apeksha");
		boolean status = file.mkdir();

		if (status) {
			System.out.println("Directory is creted");
		} else {
			System.out.println("Directory is already existed");
		}

		File f = new File("Apeksha", "aapu.txt");
		boolean isCreted = f.createNewFile();

		if (isCreted) {
			System.out.println("File is created suucessfully inside directory");

		} else {
			System.out.println("File is already exsit with same name in directory");
		}

		FileWriter f2 = new FileWriter("aapu.txt");
		f2.append("hello apeksha");

		f2.close();

//	Delete the file 1st : aapu.txt
		boolean isDeleted = f.delete();
		if (isDeleted) {
			System.out.println("File successfully deleted");
		} else {
			System.out.println("File is not present");
		}

//		Delete the directory 2nd : Apeksha

		boolean isDirDeleted = file.delete();
		if (isDirDeleted) {
			System.out.println("Directory deleted Successfully");
		} else {
			System.out.println("directory is not deleted");
		}

	}

}
