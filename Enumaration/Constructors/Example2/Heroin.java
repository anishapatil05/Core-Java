package com.anisha.enumeration.constructors;

public enum Heroin {

	SAIPALLVI(10), LATA(9), RASHMIKA(5);

//	Constructor initilizing specific values enum constants

	int value;

	private Heroin(int a) {
		value = a;
	}

}
