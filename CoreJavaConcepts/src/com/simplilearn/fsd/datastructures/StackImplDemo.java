package com.simplilearn.fsd.datastructures;

public class StackImplDemo {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		
		System.out.println(stack);
		System.out.println("Element removed from stack: "+ stack.pop());
		System.out.println("Last Element: "+ stack.peek());
		System.out.println("Is stack empty? "+ stack.isEmpty());
		System.out.println("Element removed from stack: " +stack.pop());
		System.out.println("Element removed from stack: " +stack.pop());
		System.out.println("Is stack empty? "+ stack.isEmpty());

	}

}
