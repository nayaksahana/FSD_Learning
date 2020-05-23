package com.simplilearn.fsd.datastructures;

import java.util.Stack;
public class ArrayQueue_UsingStack {
	
	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();
	
	public void enqueue(int item) {
		stack1.push(item);
	}
	
	public int dequeue() {
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}

	public int peek() {
		if(isEmpty()) {
			throw new IllegalStateException();
		}
		
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();

		
	}
/*	public String toString() {
		
	}*/
	
}
