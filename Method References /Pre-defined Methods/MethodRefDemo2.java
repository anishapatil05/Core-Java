package com.anisha.methodref;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodRefDemo2 {

	public static void main(String[] args) {
		MethodRefDemo2 obj = new MethodRefDemo2();

//		Task: Create a Supplier<Integer> that returns a random number between 1 and 100. Use:

		Supplier<Integer> getNum = MethodRefDemo2::getNumbers;
		System.out.println(getNum.get());
		System.out.println(getNum.get());
		System.out.println(getNum.get());
		System.out.println(getNum.get());

//		Task 2 

		Supplier<String> greetings = obj::getMessage;
		Consumer<String> cmsg = msg -> System.out.println(msg.toUpperCase());
		cmsg.accept(greetings.get());
	}

	public static int getNumbers() {
		Random random = new Random();
		int num = 0 + random.nextInt(100);
		return num;

	}

	public String getMessage() {
		return "Java is fun";
	}
}
