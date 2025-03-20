package com.anisha.multithreading.priorityThraed;

// Application for user-defined set priorities to which thread is excuted
public class MyThread extends Thread {

	@Override
	public void run() {

		
	}

	public static void main(String[] args) {

//		Set ny USER
		MyThread t1 = new MyThread();
		t1.setPriority(MAX_PRIORITY);
		System.out.println(t1.getName()+" "+t1.getPriority()); // 10
		t1.start();

//		Set ny USER
		MyThread t2 = new MyThread();
		t2.setPriority(MIN_PRIORITY); // 1
		System.out.println(t2.getName()+" "+t2.getPriority());

//		Set by JVM
		MyThread t3 = new MyThread();
    	System.out.println(t3.getName()+" "+t3.getPriority()); // 5

//		Set by JVM
		MyThread t4 = new MyThread();
		System.out.println(t4.getName()+" "+t4.getPriority()); // 5

	}

}
