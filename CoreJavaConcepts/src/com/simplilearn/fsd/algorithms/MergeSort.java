package com.simplilearn.fsd.algorithms;

import java.util.Arrays;

public class MergeSort {

	private void sort(int[] arr) {
		
		if(arr.length<2)
			return;
		
		int middle = arr.length/2;
		int left[] =  new int[middle];
		
		for(int i = 0; i < middle; i++) 
			left[i] = arr[i];
		
		int right[] = new int[arr.length-middle];
		
		for(int i = middle; i<arr.length; i++)
			right[i-middle] = arr[i];
		
		sort(left);
		sort(right);
		
		merge(left,right, arr);
		
	}

	private void merge(int[] left, int[] right, int result[]) {
		int  i  = 0, j = 0, k = 0;
		while(i<left.length && j<right.length) {
			if(left[i] <= right[j])
				result[k++] = left[i++];
			else
				result[k++] = right[j++];
		}
		
		while(i<left.length)
			result[k++] = left[i++];
		
		while(j<right.length)
			result[k++] = right[j++];
	}
	
	public static void main(String[] args) {
		int[] arr = {8, 6, 9, 1, 3};
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
