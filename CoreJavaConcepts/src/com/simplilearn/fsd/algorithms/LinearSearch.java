package com.simplilearn.fsd.algorithms;

public class LinearSearch {

	public int search(int arr[], int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[] = {4, 6, 9, 7, 3};
		int key = 9;
		
		LinearSearch linearSearch = new LinearSearch();
		int index = linearSearch.search(arr, key);
		
		if(index >=0 )
			System.out.println("Key found at position: " + (index+1));
		else
			System.out.println("Key not found");
		
	}

}
