package com.simplilearn.fsd.datastructures;

public class StringReverseMain {

	public static void main(String[] args) {
		String input = "abcd";
		StringReversal reversal = new StringReversal();
		try{
			String output = reversal.reverse(input);
			System.out.println("Reversed string using arithmetic operator: "+ output);
		}
		catch(Exception ex) {
			System.out.println("Input cannot be null");
		}

	}

}
