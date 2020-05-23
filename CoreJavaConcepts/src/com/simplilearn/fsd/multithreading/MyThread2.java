package com.simplilearn.fsd.multithreading;

public class MyThread2 extends Thread{
	public void run() {
		synchronized(this) {
			System.out.println("Thread2");
			for(int i=0; i<5; i++) {
				System.out.println(i);
			}
			System.out.println("Thread2 notifies");
			this.notify();
		}
	}
}
