package com.anisha.multithreading.basics;

public class MyThread4 extends Thread {

	// BUT IT IS NOT RECOMMENDED
//	not give run() then it runs empty implementation of run()

	public static void main(String[] args) {

//		main thread
		for (int i = 0; i <= 5; i++) {
			System.out.println("main thread");
		}

		new MyThread4().start();

	}

}
