package com.anisha.multithreading.interuppted;

public class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println("User Thread");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Interupted exception call");
			}
		}
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		t1.interrupt();

	}

}
