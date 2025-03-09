package com.anisha.multithreading.ex;

public class MainThreadAndMyThread {

	public static void main(String[] args) {

//		Thread Created of MyThread
		MyThread t1 = new MyThread();
		t1.start();

//		This is main Thread
		for (int i = 0; i < 4; i++) {
			System.out.println("anisha");
		}

	}

}
