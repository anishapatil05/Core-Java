package com.anisha.multithreading.daemonthread;

public class MyThread extends Thread {

	public void run() {
		System.out.println("Daemon Thread");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		t1.setDaemon(true);
		t1.start();

		for (int i = 0; i < 1; i++) {
			System.out.println("User  Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

		}

	}

}
