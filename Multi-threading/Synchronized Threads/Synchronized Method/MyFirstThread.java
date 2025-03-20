package com.anisha.multithreading.syncronized;

public class MyFirstThread extends Thread {

	public void run() {
		MyClass c1 = new MyClass();
		c1.printData(6);
	}

	public static void main(String[] args) {
		MyFirstThread t1 = new MyFirstThread();
		t1.start();

		MyFirstThread t2 = new MyFirstThread();
		t2.start();

	}

}
class MyClass {

	public synchronized void printData(int n) {
		for (int i = 0; i < 9; i++) {
			System.out.println(Thread.currentThread().getName() + " " + n * i);

		}

	}

}

