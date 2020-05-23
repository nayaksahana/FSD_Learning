package com.simplilearn.fsd.assignments;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 6;
		RotateArray rotate = new RotateArray();
		int result[] = array.clone();
		rotate.rotateArrayLeft(array, n);
		rotate.rotateArrayRight(result, n);

	}

	private void rotateArrayRight(int[] array, int n) {
		while(n>0) {
			int temp = array[array.length-1];
			for(int i = array.length-1; i>0; i--)
				array[i] = array[i-1];
			array[0] = temp;
			n--;
		}
		System.out.println("Result rotation right: " + Arrays.toString(array));
	}

	private void rotateArrayLeft(int[] array, int n) {
		while(n>0) {
			int temp = array[0];
			for(int i = 1; i< array.length; i++) 
				array[i-1] = array[i];
			array[array.length-1] = temp;
			n--;
		}

		System.out.println("Result rotation left: "+ Arrays.toString(array));
	
	
	}
}
