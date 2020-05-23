package com.simplilearn.fsd.multithreading;

public class CreateThreadOdd extends Thread {
	private static int MAX = 10;
	public void run() {
		System.out.println("Thread to create odd numbers");
		for(int i =0; i<=MAX; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
