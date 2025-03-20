package com.anisha.multithreading.joinThread;

public class MyThread2 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
//		MyThread2 t1 = new MyThread2();
//		t1.start();

		MyThread2 t2 = new MyThread2();
		t2.start();
		t2.join(2000);

		for (int i = 0; i < 5; i++) {

			System.out.println("main thread " + i);
		}

	}

}
