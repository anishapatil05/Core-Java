package com.anisha.multithreading.anonymousclass;

//public class MyRunnable implements Runnable {
//	@Override
//	public void run() {
//
//		System.out.println(Thread.currentThread().getName()+" "+"User Thread");
//		
//	}
//	public static void main(String[] args) {
//		
//		new Thread(new MyRunnable()).start();
//		new Thread(new MyRunnable()).start();
//	}

//           USING ANONYMOUS CLASS FOR RUNNABLE INTERFACE : Reducing length of code

public class MyRunnable {

	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("First thread");
		};
		Runnable r1 = () -> {
			System.out.println("Second thread");
		};

		r.run();
		r1.run();

//		Internally crates a implemented class & genrate the obj of that 
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Third thread");

			}
		};

		Thread t = new Thread(r2);
		t.start();

	}

}
