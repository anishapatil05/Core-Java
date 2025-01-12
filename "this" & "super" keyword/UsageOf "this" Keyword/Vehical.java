package com.anisha.thiskeyword;

// Usage of "this" keyword :1. refers the instance variable
public class Vehical {

	String vehicalName;
	int speed;
	int capacity;

//	Constructor: intilize the values to the instance varible while creating object
//	 Local Variable : String vehicalName, int speed, int capacity 
	public Vehical(String vehicalName, int speed, int capacity) {
		this.vehicalName = vehicalName;
		this.speed = speed;
		this.capacity = capacity;
	}

	public void getInfo() {
		System.out.println("Vehical name: " + vehicalName);
		System.out.println("speed in vh: " + speed);
		System.out.println("capacity: " + capacity);
	}

	public static void main(String[] args) {
// Calling constructor
		Vehical vehical1 = new Vehical("car", 67, 4);
		vehical1.getInfo();
		Vehical vehical2 = new Vehical("Jeep", 60, 7);
		vehical2.getInfo();

	}

}
