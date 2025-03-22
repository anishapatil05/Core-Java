package com.anisha.iostreams.consoleClass;

import java.io.Console;

// Console Class : to take command line input from Console
public class ConsoleClass {

	public static void main(String[] args) {
		Console c = System.console();
		if (c == null) {
			System.out.println("No console available. Run the program in a terminal.");
		} else {
			System.out.println("Enter your nmae ");
			String name = c.readLine();
			System.out.println("name " + name);

			System.out.println("Enter passord");
			char[] ch = c.readPassword();
			System.out.println("Password " + ch);

			String passord = String.valueOf(ch);
			System.out.println("String Password " + passord);
		}
	}

}
