package com.anisha.iostreams.bufferedStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// In try with reasoureces no need to finally block bcz it internally 
//implements Autoclosable interface

// BufferedInputStream is basically used to read image data : try with reasorces
public class BufferedInputStreamEx {

	public static void main(String[] args) {

	
//		Step 1 : Create Resorces
		try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("cartoon.jpg"));
		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("pk.jpg"))){
			
//			Step 2 : read and write resorces , c : char
			int c;
			
			while((c=inputStream.read()) != -1) {
				outputStream.write(c);
				
			}
			System.out.println("Operations are completed");
			
		}catch(IOException ie)
		{
			ie.printStackTrace();
			
		}
		

	}

}
