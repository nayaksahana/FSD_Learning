package com.simplilearn.fsd.algorithms;

public class BinarySearchIterative {

	public static void main(String[] args) {
		int arr[] = {10, 18, 20, 34, 48, 55, 68, 75, 88, 93};
		int key =  8;
		int low = 0;
		int high = arr.length;

		BinarySearchIterative binarySearch = new BinarySearchIterative();
		int location = binarySearch.search(arr, low, high, key);
		
		if(location>=0)
			System.out.println("Key found at position: " + location);
		else
			System.out.println("Key not found");
	}

	public int search(int[] arr, int low, int high, int key) {
		int left = 0;
	    int right = arr.length - 1;

	    while (left <= right) {
	      int middle = (left + right) / 2;

	      if (arr[middle] == key)
	        return middle;

	      if (key < arr[middle])
	        right = middle - 1;
	      else
	        left = middle + 1;
	    }

	    return -1;
	}

}
