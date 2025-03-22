package com.anisha.iostreams.bufferedStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Example of BufferedStream : To read text data
public class BufferedReaderEx {

	public static void main(String[] args) {

		BufferedReader reader = null;
		BufferedWriter writer = null;

		try {

//			Step 1 : Creating channals : Here the xyz.txt is already 
//			present have but the anu.txt is creted which not creted before excution

			reader = new BufferedReader(new FileReader("xyz.txt"));
			writer = new BufferedWriter(new FileWriter("anu.txt"));

//			 Step 2: read and write the resorces
			String line;

//			for line null is end of file reach
			while ((line = reader.readLine()) != null) {
				writer.write(line);
// newLine : Because it writes anu.txt in all in one line so using this move to next line
				writer.newLine();
			}
			System.out.println("Operations are completed....");
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
//			Step 3 : Release the resoures
			try {
				if (reader != null)
					reader.close();
				if (writer != null)
					writer.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}
