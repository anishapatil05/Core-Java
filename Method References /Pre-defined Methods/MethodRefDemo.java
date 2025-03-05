package com.anisha.methodref;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodRefDemo {

	public static void main(String[] args) {
		MethodRefDemo obj = new MethodRefDemo();

//		Normal Apporach to write Functional Interface Using lambda expression

		Function<String, Integer> lengthOfString = name -> name.length();

		int length = lengthOfString.apply("Anisha Patil");
		System.out.println(length);

//        Using method Reference  : className :: method name

//         1.Function 
		Function<String, Integer> lengthOfName = String::length;
		int res = lengthOfName.apply("Neha Patil");
		System.out.println(res);

//        2.Predicate
		Predicate<String> isEmptyString = String::isEmpty;
		boolean result = isEmptyString.test("");
		System.out.println(result);

//        3.Consumer
		Consumer<String> consumerEx = System.out::println;
		consumerEx.accept("anisha Patil");

		// 4.Supplier
		Supplier<String> msg = obj::sayHello;
		System.err.println(msg.get());
	
//	    Instance Reference of Arbitray obj of Predefined method
		
		Function<String, Boolean> isblankstring = String :: isBlank;
		System.out.println(isblankstring.apply(""));
	}
	
	

	public String sayHello() {
		return "Hello anisha";
	}

}
