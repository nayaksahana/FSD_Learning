package com.simplilearn.fsd.datastructures;

import java.util.LinkedList;

public class Algorithm_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
	}

}
