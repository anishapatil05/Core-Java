package com.anisha.typecasting;

/*Example of Type Casting : 1. Implicit / widening type casting
                            2. Explicit / Narrowing  type casting     */
public class DiscountOfProduct {

	public static void main(String[] args) {
		System.out.println("***Primitive data type***");
		int originalPrice = 200;
		double discountPercentage = 56.22;

//		implicit type casting : int -> double
		double discountAmmount = (originalPrice * discountPercentage) / 100;

//	   Explicit type cating : double -> int
		int finalPrice = (int) (originalPrice - discountAmmount);

		System.out.println("Original Price(int): " + originalPrice);

		System.out.println("Discount Ammount(double): " + discountAmmount);

		System.out.println("final Price(int): " + finalPrice);

		System.out.println("******Simple Example****");

		System.out.println("****implicit  Type casting****** ");
//		Implicit : short(2 byte) -> int(4 byte)
		short age = 5;
		int age1 = age;
		System.out.println(" (short to int): " + age1);

		System.out.println("***Explicit Type casting*****");
//		long(8 byte) -> int (4 byte)
		long phone_Num = 123456543l;
		int phoneNum = (int) phone_Num;
		System.out.println("(long -> int): " + phoneNum);

	}

}
