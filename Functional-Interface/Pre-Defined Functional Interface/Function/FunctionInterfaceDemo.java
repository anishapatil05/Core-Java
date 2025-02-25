package com.anisha.predefinedfi.function;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {

//		Example 1
		Function<String, Integer> chekinglength = (String s) -> {
			return s.length();
		};

//		Calling Function Interface
		int val = chekinglength.apply("Anisha Patil");
		System.out.println(val);

//		Example 2
		Function<Integer, String> exp = num -> {
			return "num :" + num;
		};

//		Calling Function Interface
		String sent = exp.apply(56);
		System.out.println(sent);

//		Example 3
		Function<String, String> doingToUpperCase = var -> {
			return var.toUpperCase();
		};

		System.out.println(doingToUpperCase.apply("anisha"));

//		andThen default method

		Function<String, String> ischecking = input -> input == null ? "Enter valid String " : input;

		String value = ischecking.andThen(doingToUpperCase).apply(null);
		System.out.println(value);

	}

}
