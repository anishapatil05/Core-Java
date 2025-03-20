package com.anisha.multithreading.synochonized;

public class MyThread {

	public static void main(String[] args) {

		new MyThread3().start();
		new MyThread4().start();
		new MyThread5().start();
	}

}

// Main Repositry
class MyThread2 {

//	But it decrease the performaence bcz wating for complition of 1 thread
	public synchronized static void msg(String str) {
		for (int i = 0; i < 3; i++) {
			System.out.println("hi " + str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}

// Customer 1
class MyThread3 extends Thread {

	public void run() {
		MyThread2.msg("anu");
	}
}

// Customer 2
class MyThread4 extends Thread {
	public void run() {
		MyThread2.msg("sanuu");
	}
}

//Customer 3
class MyThread5 extends Thread {
	public void run() {
		MyThread2.msg("getaa");
	}
}
