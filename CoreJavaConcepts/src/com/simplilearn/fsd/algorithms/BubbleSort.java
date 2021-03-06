package com.simplilearn.fsd.algorithms;

import java.util.Arrays;

public class BubbleSort {
	
	public void sort(int arr[]) {
		boolean isSorted;
		for(int i =0; i<arr.length; i++) {
			isSorted = true;
			for(int j = 1; j<arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					swap(arr, j, j-1);
					isSorted = false;
				}
				if(isSorted)
					continue;
			}
		}
	}

	public void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {8, 6, 9, 1, 3};
		
		BubbleSort bubbleSort =  new BubbleSort();
		bubbleSort.sort(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
