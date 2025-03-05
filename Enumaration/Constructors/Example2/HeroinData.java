package com.anisha.enumeration.constructors;

public class HeroinData {

	public static void main(String[] args) {
	
		Heroin[] hh = Heroin.values();
		for(Heroin b : hh) {
			System.out.println(b+" "+b.value);
		}
	}

}
