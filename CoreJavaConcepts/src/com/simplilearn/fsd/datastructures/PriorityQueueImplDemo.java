package com.simplilearn.fsd.datastructures;

public class PriorityQueueImplDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue queue = new PriorityQueue();
		try {
		queue.add(60);
		queue.add(50);
		queue.add(30);
		queue.add(20);
		queue.add(40);
		queue.add(10);
		}catch(IllegalStateException ex) {
			System.out.println("Queue Full");
		}
		System.out.println(queue);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
	}

}
