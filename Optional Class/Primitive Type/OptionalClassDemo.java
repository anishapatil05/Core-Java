package com.anisha.optionalclass;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {

		OptionalClassDemo obj = new OptionalClassDemo();

		Optional<String> res = obj.getValue();

		if (res.isPresent()) {

			String realRes = res.get();
			System.out.println(realRes.toUpperCase());

		} else {
			System.out.println("No value is Present");
		}

	}

	public Optional<String> getValue() {

		return Optional.of("shareya");
//		return Optional.empty();
	}
}
