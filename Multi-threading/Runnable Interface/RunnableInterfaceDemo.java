package com.anisha.multithreading.runnableinterface;

public class RunnableInterfaceDemo {

	public static void main(String[] args) {

//		Pre-defined Functional Interface
		Runnable r1 = () -> {
			System.out.println("Thread Starting");
		};

		Thread t1 = new Thread(r1);
		t1.start();
	}

}
