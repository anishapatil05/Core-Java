package com.anisha.iostreams.bytestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Example of byte Stream which conatins the image type data 
public class ByteStreamImageData {

	public static void main(String[] args) {

		FileInputStream fileInput = null;
		FileOutputStream fileOutput = null;

		try {
//			Step 1 : create Channels
			fileInput = new FileInputStream("cartoon.jpg");
			fileOutput = new FileOutputStream("xyz.jpg");

//		     Step 2 : read and write operations

			int temp; // for temp storage to add px data into temp from cartoon.jpg
			while ((temp = fileInput.read()) != -1) {

				fileOutput.write(temp);
			}

			System.out.println("Operation is completed....");

		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fileInput != null)
					fileInput.close();
				if (fileOutput != null)
					fileOutput.close();
			} catch (IOException ie) {
				ie.printStackTrace();

			}

		}

	}

}
