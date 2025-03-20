package com.anisha.multithreading.methods;

public class MyThread2 extends Thread {

	public void run()
	{
		
	}
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
	    t1.start();
		System.out.println(t1.getName());
		
		MyThread2 t2 = new MyThread2();
	    t2.start();
		System.out.println(t2.getName());
		
//		setName() : for setting userdefined name 
		t1.setName("User-Thread insted of Thread-0 ");
		System.out.println(t1.getName());
		
		t2.setName("User-Thread2 insted of Thread-1");
		System.out.println(t2.getName());
		
//		isAlive() : Cheack if Thread is Alive or not 
		System.out.println("t2 Thread "+t2.isAlive());
		System.out.println("t1 Thread "+t1.isAlive());
		
//	    running at background & terminates when all user-thread are ends 
		System.out.println(t2.isDaemon());
		System.out.println(t1.isDaemon());
		
//		To get the name of Main thread
		System.out.println(Thread.currentThread().getName()); 
		
//		To get count of active thread in all code
		System.out.println(Thread.activeCount());
		
//		It gives paraticular thraed is alive
		System.out.println(t1.isAlive());
		

	}

}
