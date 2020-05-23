package com.simplilearn.fsd.multithreading;

public class MyThread1{
	public static void main(String args[]) throws InterruptedException {
		MyThread2 thread2 = new MyThread2();
		thread2.start();
		synchronized(thread2) {
			System.out.println("Main thread calling wait");
			thread2.wait();
			System.out.println("Main thread got notification");
		}
	}
}
