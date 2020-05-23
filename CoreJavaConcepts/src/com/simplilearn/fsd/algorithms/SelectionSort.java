package com.simplilearn.fsd.algorithms;

import java.util.Arrays;

public class SelectionSort {
	
	public void sort(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			int minIndex = i;
			
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j]<arr[minIndex]) 
					minIndex = j;
			}
			
			swap(arr, minIndex, i);
		}
	}

	public void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {8, 6, 9, 1, 3};
		
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
