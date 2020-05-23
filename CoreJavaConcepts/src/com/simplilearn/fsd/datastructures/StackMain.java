package com.simplilearn.fsd.datastructures;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		System.out.println(stack);
		System.out.println("Last inserted element: "+ stack.peek());
		int top = stack.pop();
		System.out.println("Element removed:"  +top);
		System.out.println(stack);
	}

}
