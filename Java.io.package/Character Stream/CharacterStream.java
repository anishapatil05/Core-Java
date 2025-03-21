package com.anisha.iostreams.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

	public static void main(String[] args) throws IOException {

//		Step 1 : Create Channel 
//			FileReader  : for reading file i.e abc.txt
		FileReader reader = new FileReader("abc.txt");
		FileWriter writer = new FileWriter("xyz.txt");

//		step 2 : read and write data 

		int c; // storing in temp var
		while ((c = reader.read()) != -1) // not equal -1 represents data is present
		{
			writer.write(c);
			System.out.println(c);
		}

//		Closing channels
		reader.close();
		writer.close();
	}

}
