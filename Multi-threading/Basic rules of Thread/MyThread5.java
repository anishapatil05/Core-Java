package com.anisha.multithreading.basics;

public class MyThread5 extends Thread {

	public void run() {
		System.out.println("user thread");
	}

	public static void main(String[] args) {

//		Multiple threads run simultenously order is not preserved
//		thread 1
		new MyThread5().start();

//		thread 2
		new Mythread3().start();

//		thread 3
		new MyThread5().start();

	}

}
