package com.anisha.multithreading.yeildMethod;

public class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {

//			Pauses the current thread and give chance to waiting threads
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();

		MyThread t2 = new MyThread();
		t2.start();

		for (int i = 0; i < 6; i++) {
			Thread.yield();
			System.out.println("main thread");
		}
	}

}
