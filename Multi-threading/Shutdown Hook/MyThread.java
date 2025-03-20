package com.anisha.multithreading.hookThread;

public class MyThread extends Thread {

	public void run() {
		System.out.println("Hook Thread");
	}

	public static void main(String[] args) {

//		Making noraml thread as Hook Thread
		MyThread t1 = new MyThread();
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(t1);
		r.removeShutdownHook(t1);

//		main thread
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			if (i == 5) {
				System.exit(0);
			}
		}

		
	}

}
