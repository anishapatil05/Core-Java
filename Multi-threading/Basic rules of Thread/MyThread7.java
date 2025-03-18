package com.anisha.multithreading.basics;

public class MyThread7 extends Thread {

//	it calls normal MyThread7 class method excuted not a Thread class & thread is not created

	// BUT IT IS NOT RECOMMENDED
	public void start() {
		for (int i = 0; i < 9; i++) {
			System.out.println("normal start method");
		}
	}

	public static void main(String[] args) {

		new MyThread7().start();

	}

}
