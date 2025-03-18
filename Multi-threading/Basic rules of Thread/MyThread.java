package com.anisha.multithreading.basics;

public class MyThread extends Thread {

	public void run() {
		System.out.println("user thread");
	}

	public static void main(String[] args) {

		new MyThread().start();

//		main Thread
		System.out.println("main thread");

	}

}
