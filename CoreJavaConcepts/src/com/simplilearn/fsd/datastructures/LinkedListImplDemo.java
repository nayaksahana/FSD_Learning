package com.simplilearn.fsd.datastructures;

public class LinkedListImplDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addFirst(50);
		
		System.out.println("Complete list: " + list);
		System.out.println("Index of 50: "+ list.indexOf(50));
		System.out.println("List contains 20? " +list.contains(20));
		list.removeFirst();
		System.out.println("List after removing first element: " +list);
		System.out.println("List contains 50? " + list.contains(50));		
		list.removeLast();
		System.out.println("List after removing last element: " +list);
	}
	


}
