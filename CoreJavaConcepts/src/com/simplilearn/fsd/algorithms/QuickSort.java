package com.simplilearn.fsd.algorithms;

import java.util.Arrays;

public class QuickSort {
	
	public void sort(int[] arr, int start, int end) {
		if(start >= end)
			return;
		int boundary = partition(arr,start,end);
		
		sort(arr, start, boundary-1);
		
		sort(arr, boundary+1, end);
	}
	
	private int partition(int arr[], int start, int end) {
		int pivot =  arr[end];
		int boundary = start-1;
		for(int i = start; i <= end; i++) {
			if(arr[i] <= pivot) {
				swap(arr, i, ++boundary);
			}
		}
		return boundary;
	}
	
	public void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	

	public static void main(String[] args) {
		int[] arr = {8, 6, 9, 1, 3};
		
		QuickSort quickSort = new QuickSort();
		quickSort.sort(arr, 0, 4);
		
		System.out.println(Arrays.toString(arr));

	}

}
