package com.simplilearn.fsd.datastructures;

import java.util.Stack;

public class StringReversal {
	public String reverse(String input) {
		
		Stack<Character> character = new Stack<Character>();
		String output = "";
		
		//Using string buffer
		for(char ch: input.toCharArray())
			character.push(ch);
		
		StringBuffer stringBuffer = new StringBuffer();
		
		while(!character.isEmpty()) {
			stringBuffer.append(character.pop());
		}
		
		System.out.println("Reversing using StringBuffer: " + stringBuffer);
		
		//Using arithmetic operator
		for(char ch: input.toCharArray())
			character.push(ch);
		
		 while(!character.isEmpty()) {
			output+=character.pop();
		}
		return output;
	}
}
