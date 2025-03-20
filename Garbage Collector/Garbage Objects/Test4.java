package com.anisha.bacis;

//Ways to how objects are eligibal for garbage collector  : 
//             4.One String ref is assign to another 
public class Test4 {

	public void finalize() {
		System.out.println("Object Destroyed");
	}

	public static void main(String[] args) {
//           String str = "anisha";         //String Pool objects are NOT garbage collected 
//           String str2 = "sanuu";

		String str = new String("anisha");
		String str2 = new String("sanuu");

		str = str2;

		System.gc();
		System.out.println("End of main method");
	}

}
