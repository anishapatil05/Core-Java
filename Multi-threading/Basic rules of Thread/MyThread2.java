package com.anisha.multithreading.basics;

public class MyThread2 extends Thread {

	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("user Thread");
		}

	}

	public static void main(String[] args) {

//		Here the Thread is not created bcz of normal method calling only of run()
		// BUT IT IS NOT RECOMMENDED
		new MyThread2().run();

//		main thread
		System.out.println("main thread");

	}

}
