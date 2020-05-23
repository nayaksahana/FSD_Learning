package com.simplilearn.fsd.datastructures;

import java.util.EmptyStackException;

public class ArrayQueue_Main {
	public static void main(String[] args) {
		ArrayQueue_UsingStack queue =  new ArrayQueue_UsingStack();
		try {
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		
	//	System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		queue.dequeue();
		System.out.println(queue.isEmpty());
		queue.dequeue();
		//queue.dequeue();
		
		System.out.println(queue.isEmpty());
		
		}
		catch(EmptyStackException ex) {
			System.out.println("Empty Stack");
		}
	}
}
