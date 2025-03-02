package com.anisha.streamapi.joining;

import java.util.ArrayList;
import java.util.stream.Collectors;

import com.anisha.streamapi.grouping.*;

public class StreamAPIJoining {

	public static void main(String[] args) {

		ArrayList<Product> allProdInfo = ProductStreamOperations.getAllProductInfo();

		String names = allProdInfo.stream().map(p -> p.getName()).collect(Collectors.joining(" <-> ")); // we can take
																										// any dilimeter
																										// like , @ ,
																										// ^,%,&,*

		System.out.println(names);

	}

}
