package com.anisha.grabagecollector.memoryaddess;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		Test t1 = new Test();

//		To print references of memory address in two ways 
//         1.hashcode()
//		   2.toString()

//		Using hashcode()
		System.out.println(t.hashCode()); // 1159190947
		System.out.println(t1.hashCode()); // 925858445

//		Using toString() 
		System.out.println(t.toString()); // com.anisha.grabagecollector.memoryaddess.Test@4517d9a3
		System.out.println(t1.toString()); // com.anisha.grabagecollector.memoryaddess.Test@372f7a8d

	}

}
