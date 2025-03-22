package com.anisha.iostreams.chararraywriter;

import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// CharArrayWriter : Used to write data into multiple files
public class CharArrayWriterEx {

	public static void main(String[] args) throws IOException {

//		Step 1: Create resorces
		CharArrayWriter ch = new CharArrayWriter();
		FileReader reader = new FileReader("xyz.txt");

//		step 2: read and write oprations

		int c;
		while ((c = reader.read()) != -1) {
			ch.write(c);
		}

//		Created multiple files to store data

		FileWriter w = new FileWriter("a.txt");
		FileWriter w1 = new FileWriter("b.txt");
		FileWriter w2 = new FileWriter("c.txt");
		FileWriter w3 = new FileWriter("d.txt");

//		write data in multiple files

		ch.writeTo(w);
		ch.writeTo(w3);
		ch.writeTo(w2);
		ch.writeTo(w1);

//	   close the resoures
		reader.close();
		w.close();
		w1.close();
		w2.close();
		w3.close();

		System.out.println("Operations are completed....");

	}

}
