package com.simplilearn.fsd.algorithms;

import com.simplilearn.fsd.assignments.BinarySearchRecursive;

public class ExponentialSearch extends BinarySearchRecursive{
	
	public int search(int[] array, int target) {
        int bound = 1;
        while(array[bound] < target && bound < array.length)
            bound *= 2;
        
        int left = bound / 2;
        int right = Math.min(bound, array.length-1);
        return this.search(array, target, left, right);
	}

	public static void main(String[] args) {
		
		int arr1[] = { 2, 3, 4, 10, 40 };
        ExponentialSearch es = new ExponentialSearch();
        int x1 = 3;
        int result1 = es.search(arr1, x1);
        System.out.println("Exponential Search");
        System.out.println("Element found at index " + result1);
	}

}
