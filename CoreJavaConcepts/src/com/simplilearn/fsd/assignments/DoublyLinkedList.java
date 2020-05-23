package com.simplilearn.fsd.assignments;

public class DoublyLinkedList {


		
		class Node{
			int data;
			Node next, previous;
			
			Node(int data){
				this.data = data;
				this.next = this.previous = null;
			}
		}
		
		public Node head = null;
		public Node tail = null;
		
		public void addNodeLast(int data) {
			Node newNode = new Node(data);
			
			if(head == null) {
				head = tail = newNode;
				head.previous = null;
				tail.next = null;
			}
			
			else {			
				tail.next = newNode;
				newNode.previous = tail;
				tail = newNode;
				tail.next = null;
			}

		}
		
		public void addNodeFirst(int data) {
			Node newNode = new Node(data);
			
			if(head == null) {
				head = tail = newNode;
				head.previous = null;
				tail.next = null;
			}
			else {
				Node current = head;
				head = newNode;
				current.previous = head;
				head.next = current;
			}

		}
		
		 public void addInMid(int data, int position){  
	 
		        Node newNode = new Node(data);  
		        
		        if(head == null) {  
		        	head = tail = newNode;
					head.previous = null;
					tail.next = null;
		        }  
		        else {  
		            Node temp, current;  
	 

		            temp = head;  
		            current = null;  

		            for(int i = 0; i < position; i++) {  

		                current = temp;  
		                temp = temp.next;  
		            }  
		            newNode.previous = current;
		            current.next = newNode;   
		            temp.previous = newNode;
		            newNode.next = temp;  
		        }  
 
		    }  
		 
		public DoublyLinkedList delete(DoublyLinkedList list, int key) {
			Node currNode = list.head, prev = null;
			
			if (currNode != null && currNode.data == key) {
				currNode.previous = null;
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
		
		public void displayForward() {
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
		
		public void displayReverse() {
			Node current = tail;
			if(head == null) {
				System.out.println("List is empty");
				return;
			}
			
			else{
				while(current != null) {
					System.out.print(current.data + " "); 
					current = current.previous;
				}
			}
		}

		public static void main(String[] args) {
			
			DoublyLinkedList linkedList = new DoublyLinkedList();
			
			linkedList.addNodeLast(35);
			linkedList.addNodeFirst(12);
			linkedList.addNodeLast(63);
			linkedList.addNodeFirst(26);
			linkedList.addNodeLast(75);
			
			linkedList.displayForward();
			System.out.println();
			linkedList.addInMid(83,4);
			
			System.out.println("Display forward");
			linkedList.displayForward();
			System.out.println();
			System.out.println("Disply Reverse");
			linkedList.displayReverse();
			System.out.println();
			linkedList = linkedList.delete(linkedList, 26);
			System.out.println("Display Forward");
			linkedList.displayForward();
			System.out.println();
			System.out.println("Display reverse");
			linkedList.displayReverse();

		}

	}

