package com.anisha.multithreading.runnableinterface;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("User Thraed");
		}

	}

	public static void main(String[] args) {

		MyThread2 t1 = new MyThread2();
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		new Thread(new MyThread2()).start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main Thraed");
		}
	}

}
