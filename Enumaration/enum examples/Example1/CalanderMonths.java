package com.anisha.enumeration;

//  Inside enum if other elements are present then at last constants ; is mandtory
public enum CalanderMonths {

	JAN, FEB, MARCH, APRIL, MAY, JUNE, JULY; // Semicolon is mandetory

	CalanderMonths() {
		System.out.println("0 arg Constructor");
	}

}
