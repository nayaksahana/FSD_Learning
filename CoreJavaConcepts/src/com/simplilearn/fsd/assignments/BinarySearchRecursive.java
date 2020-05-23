package com.simplilearn.fsd.assignments;

public class BinarySearchRecursive {
	
	public int search(int arr[], int low, int high,int key) {
		if (high < low)
			return -1;
		
		int mid = (low + high) / 2;
		
		if (arr[mid] == key)
			return mid;
		
		if (key < arr[mid])
			return search(arr, low, mid-1, key);
		
		return search(arr, mid + 1, high, key);
	}

	public static void main(String[] args) {
		
		int arr[] = {10, 18, 20, 34, 48, 55, 68, 75, 88, 93};
		int key =  81;
		int low = 0;
		int high = arr.length;

		BinarySearchRecursive binarySearch = new BinarySearchRecursive();
		int location = binarySearch.search(arr, low, high, key);
		
		if(location>=0)
			System.out.println("Key found at position: " + location);
		else
			System.out.println("Key not found");
	}

}
