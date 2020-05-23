package com.simplilearn.fsd.algorithms;

import java.util.Arrays;

public class InsertionSort {
	
	public void sort(int arr[]) {
		
		for(int i = 0; i< arr.length; i++) {
			int current = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>current) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = current;
		}
	}

	public static void main(String[] args) {
		int[] arr = {8, 6, 9, 1, 3};
		
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
