package com.anisha.multithreading.joinThread;

public class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		MyThread t1 = new MyThread();
		t1.start();

//		Excuting t1 method and stopping the excution of all threads  
		t1.join();

		MyThread t2 = new MyThread();
		t2.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main thread " + i);

		}

	}

}
