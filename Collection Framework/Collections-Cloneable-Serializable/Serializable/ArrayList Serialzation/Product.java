package com.anisha.collections.serilazing.arraylist;

import java.io.Serializable;

public class Product implements Serializable {

	String pname;
	int pid;
	double pcost;

	public Product(String pname, int pid, double pcost) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.pcost = pcost;
	}

}
