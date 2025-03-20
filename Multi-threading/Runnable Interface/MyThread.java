package com.anisha.multithreading.runnableinterface;

public class MyThread implements Runnable {

	public void run() {
		System.out.println("thread started exucting");
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

//		1st apporach
		MyThread t1 = new MyThread();
		Thread tread1 = new Thread(t1);
		tread1.start();

//	   2nd apporach
		Thread t2 = new Thread(new MyThread());
		t2.start();

	}

}
