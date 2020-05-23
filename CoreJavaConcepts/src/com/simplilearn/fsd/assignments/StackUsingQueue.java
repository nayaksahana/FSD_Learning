package com.simplilearn.fsd.assignments;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingQueue {
	
	private static Queue<Integer> q1 = new LinkedList<Integer>();
	private static Queue<Integer> q2 = new LinkedList<Integer>();
	static int size;
	
	
	public void push(int i){
		if(q1.size()==0)
			q1.add(i);
		
		else{
			int sizeOfQueue1 = q1.size();
			
			for(int j=0 ; j<sizeOfQueue1 ; j++)
				q2.add(q1.remove());
			
			q1.add(i);
			
			for(int k=0 ; k<sizeOfQueue1 ; k++)
				q1.add(q2.remove());
		}
	}
	
	public int peek(){
		if(q1.isEmpty())
			throw new NullPointerException();
		return q1.peek();
	}
	
	public int pop(){
		return q1.remove();
	}
 


	public static void main(String[] args) {
		StackUsingQueue s = new StackUsingQueue();
		s.push(35);
		s.push(10);
		s.push(20);
		s.push(35);
		System.out.println(s.peek());
		try {
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
		}
		catch(NoSuchElementException ex) {
			System.out.println("Stack is empty");
		}
		
	}
}
