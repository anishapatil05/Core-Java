package com.anisha.thiskeyword.SuperKeyword;

import java.util.Scanner;

public class FastDelivery extends ProductDelivery {

	String location = "jaysingpur";
	double extraAmmount;
	int minDeliverydate;

	public FastDelivery(double extraAmmount, int minDeliverydate) {
//		usage "super" keyword 2: calling constructor
		super("laptop", 3, 666);

//		usage "super" keyword 1: calling instance var
		System.out.println("Your location is: " + super.location);

		this.extraAmmount = extraAmmount;
		this.minDeliverydate = minDeliverydate;

	}

//	override method
	public void printInfo() {
//		 calling printInfo() from parent class
		super.printInfo();
		double totalAmmount = extraAmmount + ammount;
		System.out.println("extra ammount for fast delivery: " + extraAmmount);
		System.out.println("total ammount: " + totalAmmount);

//	usage "super" keyword 3: calling the method
		super.productDeliveryRespoence();
	}

	public static void main(String[] args) {
		FastDelivery proddelivery = new FastDelivery(333, 2);
		proddelivery.printInfo();

	}

}
