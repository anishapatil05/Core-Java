package com.anisha.multithreading.syncronized.block;

public class MyThread {

	public static void main(String[] args) {
		MyThread2 th = new MyThread2();
		MyThread3 th2 = new MyThread3(th);
		MyThread4 th3 = new MyThread4(th);

		th2.start();
		th3.start();
	}

}

class MyThread2 {
	public void msg(int a) {
		synchronized (this) {
			System.out.println("Lucky num " + a);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

		System.out.println("After synchronized block");
	}
}

class MyThread3 extends Thread {
	MyThread2 th;

	public MyThread3(MyThread2 th) {
		this.th = th;
	}

	public void run() {
		th.msg(31);
	}
}

class MyThread4 extends Thread {
	MyThread2 th;

	public MyThread4(MyThread2 th) {
		this.th = th;
	}

	public void run() {
		th.msg(5);
	}

}
