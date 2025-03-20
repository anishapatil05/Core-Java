package com.anisha.grabagecollector.memoryaddess;

public class Test2 {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();

		// total memory allocated to the JVM by the OS.
		System.out.println("Total memory  " + (r.totalMemory() / (1024.0 * 1024 * 1024)) + " GB");

		// amount of unused memory within the allocated JVM memory.
		System.out.println("free memory " + (r.freeMemory() / (1024.0 * 1024 * 1024)) + " GB");

		for (int i = 0; i < 100000; i++) {
			Test2 t = new Test2();
		}

//		t unused 100000 obj will be stored in freememory(heap mem)
		System.out.println("After allocating obj to free memory " + r.freeMemory());

//		requesting GC
		r.gc();

//		the gc taking unused obj from freememory then freeMemory increses 
		System.out.println("After calling garbage collector " + r.freeMemory());

	}

}
