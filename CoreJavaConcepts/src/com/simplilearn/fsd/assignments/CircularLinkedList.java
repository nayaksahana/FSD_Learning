package com.simplilearn.fsd.assignments;

public class CircularLinkedList {
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
		
	public void addNode(int data) {
		Node newNode = new Node(data);
			
		if(head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}
		else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
		
	public void addInMid(int data, int position){  
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;  
		    tail = newNode;  
		    newNode.next = head;
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
		 
	public void delete(int key) {
		if(head == null) {  
            return;  
        }  
        else {  
          
            if(head != tail ) {  
                Node current = head;  
                 
                while(current.next != tail) {  
                    current = current.next;  
                }  
                tail = current;   
                tail.next = head;  
            }  
              
            else {  
                head = tail = null;  
            }  
        }  
	}
	
	public void display() {
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
			
		else{
			do {
				System.out.print(current.data + " "); 
				current = current.next;
			}while(current != head);
		}
	}

	public static void main(String[] args) {
		CircularLinkedList linkedList = new CircularLinkedList();
		linkedList.addNode(52);
		linkedList.addNode(28);
		//linkedList.addInMid(63, 2);
		linkedList.addNode(47);
		linkedList.addNode(32);
		linkedList.display();
		
		linkedList.delete(32);
		linkedList.display();
		linkedList.delete(2);
		linkedList.display();
	}
}

