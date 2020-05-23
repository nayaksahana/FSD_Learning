package com.simplilearn.fsd.datastructures;

import java.util.Arrays;

public class PriorityQueue {
	private int[] items = new int[5];
	private int count;
	
	public void add(int item) {
		if(count == items.length) {
			throw new IllegalStateException();
		}
		int i;
		for ( i = count-1; i >=0; i--) {
			if(items[i] > item) 
				items[i+1] = items[i];
			else
				break;
		}
		items[i+1] = item;
		count++;
	}
	
	public int remove() {
		if(count == 0)
			throw new IllegalStateException();
		return items[--count];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	public String toString() {
		int[] content =  Arrays.copyOfRange(items, 0, count);
		return Arrays.toString(content);
	}
}
