package com.simplilearn.fsd.multithreading;

public class CreateThreadEven extends Thread {
	private static int MAX = 10;
	public void run() {
		System.out.println("Thread created to print even numbers");
		for(int i=1; i<=MAX; i++)
		{
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
