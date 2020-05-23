package com.simplilearn.fsd.datastructures;

public class Algorithm_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array numbers = new Array(3);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);
		numbers.print();
		numbers.removeAt(2);
		System.out.println("After removal");
		numbers.print();
		System.out.println("Index of number:" + numbers.indexOf(30));
	}

}
