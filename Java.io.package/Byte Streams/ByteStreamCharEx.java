package com.anisha.iostreams.bytestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// bytestream using read text data 
public class ByteStreamCharEx {

	public static void main(String[] args) {
	

//		Step 1 : Create the Resources
		try( FileInputStream inputStream  = new FileInputStream("b.txt"); 
			 FileOutputStream outputStream = new FileOutputStream("janu.txt"))
		{
//			Step 2: read and write opration
			
			int c;
			while((c = inputStream.read()) != -1)
			{
				outputStream.write(c);
			}
			System.out.println("Operations are completed...");
			
		}catch(IOException ie )
		{
			ie.printStackTrace();
		}

	}

}
