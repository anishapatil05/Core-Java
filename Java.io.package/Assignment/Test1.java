package com.anisha.iostreams.assignment;

import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {

//		Observation 1 : write content some inside abc file
		FileWriter file = new FileWriter("abc.txt");
		file.append("i am writing some content");

//	    Closing channel is imp
		file.close();

	}

}
