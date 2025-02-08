package com.anisha.userdifined.exceptiontype;

// Creating userdefined unchecked exception
public class InvalidCardNumberException extends RuntimeException{

//	 Default Constructor 
	public InvalidCardNumberException(String str) {
		super(str);
	}
	
}
