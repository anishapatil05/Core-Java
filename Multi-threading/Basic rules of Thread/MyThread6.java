package com.anisha.multithreading.basics;

public class MyThread6 extends Thread {

//	run() overloading
	public void run() {
		for (int i = 0; i < 8; i++) {
			System.out.println("0-arg run method");
		}

//		calling run(int a) explicitly in run()
		run(6);
	}

	public void run(int a) {
		System.out.println("1 -arg method");
	}

	public static void main(String[] args) {

		new MyThread6().start();

	}

}
