package com.anisha.multithreading;

// Thread Class
public class FirstClass extends Thread {

	@Override
	public void run() {
		System.out.println("Thread Exucution is starting");
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread is Extuted");
		}
	}

	public static void main(String[] args) {

//		Creating Obj : thread 1
		FirstClass t1 = new FirstClass();

//		to excute logic thread required strat()
		t1.start();
		
//		thread 2
		 FirstClass t2 = new FirstClass();
		 t2.start();
	}

}
