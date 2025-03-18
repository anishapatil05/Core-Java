package com.anisha.multithreading.basics;

public class Mythread3 extends Thread {

//	Here we like this we call the logic in run() bcz the start() call the run
	public void run() {
		m1();
		m2();
		m3();
	}

	public void m1() {
		System.out.println("m1 method");
	}

	public void m2() {
		System.out.println("m2 method");
	}

	public void m3() {
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
//		method call excuted
		new Mythread3().start();

//	   main thread
		System.out.println("main thread");
	}

}
