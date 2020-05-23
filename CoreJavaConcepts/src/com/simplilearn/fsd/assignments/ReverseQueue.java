package com.simplilearn.fsd.assignments;

import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		int k = 3;
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
		System.out.println("Input queue: " +queue);
		
		reverse(queue,k);
	}

	private static void reverse(Queue<Integer> queue, int k) {
		
		int[] array = new int[k];
		
		for(int i = k-1; i>=0; i--)
			array[i] = queue.remove();
		
		for(int i=0; i<k; i++)
			queue.add(array[i]);
		
		for(int i= 0; i<k-1; i++) 
			array[i] = queue.remove();

		for(int i = 0; i<k-1; i++)
			queue.add(array[i]);
			
		System.out.println("Queue after reversing: "+queue);
	}
}
