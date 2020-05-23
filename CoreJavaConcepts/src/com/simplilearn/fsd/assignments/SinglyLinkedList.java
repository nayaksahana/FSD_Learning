package com.simplilearn.fsd.assignments;

public class SinglyLinkedList {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNodeLast(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void addNodeFirst(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			Node current = head;
			head = newNode;
			head.next = current;
		}
	}
	
	 public void addInMid(int data, int position){  
 
	        Node newNode = new Node(data);  
	        
	        if(head == null) {  

	            head = newNode;  
	            tail = newNode;  
	        }  
	        else {  
	            Node temp, current;  
 
	            temp = head;  
	            current = null;  

	            for(int i = 0; i < position; i++) {  

	                current = temp;  
	                temp = temp.next;  
	            }  
	            current.next = newNode;   
	            newNode.next = temp;  
	        }    
	    }  
	 
	public SinglyLinkedList delete(SinglyLinkedList list, int key) {
		Node currNode = list.head, prev = null;
		
		if (currNode != null && currNode.data == key) {
			list.head = currNode.next; 
			System.out.println(key + " found and deleted");  
			return list;
		}
			
		while (currNode != null && currNode.data != key) {
			prev = currNode; 
			currNode = currNode.next;
		}
			
		if (currNode != null) {
			prev.next = currNode.next;
			System.out.println(key + " found and deleted");
		}
			
		if (currNode == null)
			System.out.println(key + " not found");
		
		return list;
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		else{
			while(current != null) {
				System.out.print(current.data + " "); 
				current = current.next;
			}
		}
	}

	public static void main(String[] args) {
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		linkedList.addNodeLast(35);
		linkedList.addNodeFirst(12);
		linkedList.addNodeLast(63);
		linkedList.addNodeFirst(26);
		linkedList.addNodeLast(75);
		
		linkedList.addInMid(83,2);
		
		linkedList.display();
		System.out.println();
		linkedList = linkedList.delete(linkedList, 63);
		linkedList.display();

	}

}
