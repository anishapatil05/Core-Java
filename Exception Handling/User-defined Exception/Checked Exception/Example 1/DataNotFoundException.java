package com.anisha.userdifined.exceptiontype;

// Created User-defined Exception Class : DataNotFoundException

/* Rules : 1. The class must be inherited from throwable 
 *         2. Creating String arg Constructor that is inherited from Exception class */
public class DataNotFoundException extends Exception{
        public DataNotFoundException(String message) {
			super(message);
		}
}
