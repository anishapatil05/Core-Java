package com.anisha.multithreading.anonymousclass;

//public class MyThread extends Thread {
//	public void run()
//	{
//		System.out.println("user thread");
//	}
//
//	public static void main(String[] args) {
//		
//		MyThread t1 = new MyThread();
//		t1.start();
//
//	}

//           USING ANONYMOUS INNER CLASS : Reduce the length of the code

public class MyThread {

	public static void main(String[] args) {

		// THREAD 1
		Thread t = new Thread() {
			public void run() {
				System.out.println("First Thread");
			}
		};
		t.start();

		// THREAD 2
		new Thread() {
			public void run() {
				System.out.println("Second thread");
			}
		}.start();

	}

}
