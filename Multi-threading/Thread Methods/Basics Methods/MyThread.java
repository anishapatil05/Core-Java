package com.anisha.multithreading.methods;

public class MyThread extends Thread {

	public void run() {

//		isDaemon()
		System.out.println("is Daemon thread " + isDaemon());

		int i = 0;
		while (i < 5) {
//			getName()
			System.out.println("Current thread " + Thread.currentThread().getName());
			System.out.println("Multiplication " + 5 * i);
			i++;

//			sleep()
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				throw new RuntimeException();
			}

		}
	}

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
//		setName()
		t1.setName("first thread");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		MyThread t2 = new MyThread();
		t2.setName("second thread");
		t2.start();

	}

}
