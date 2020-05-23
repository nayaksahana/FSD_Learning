package com.simplilearn.fsd.datastructures;

public class LinkedList {
	
	public class Node{
		
		private int value;
		private Node next;
		public Node(int value) {
			super();
			this.value = value;
		}
		
	}

	Node first;
	Node last;
	
	public void addLast(int item){
		Node node = new Node(item);
		if(isEmpty()){
			first = last = node;
		}
		else{
			last.next = node;
			last = node;
		}
	}
	
	public void addFirst(int item){
		Node node = new Node(item);
		if(isEmpty()){
			first = last = node;
		}
		else{
			node.next = first;
			first = node;
		}
	}
	
	private boolean isEmpty(){
		return first ==null;
	}
	
	public int indexOf(int item){
		int index = 0;
		Node current = first;
		while(current!=null){
			if(current.value == item)
				return index;
			else{
				current = current.next;
				index++;
			}
		}
		return -1;
	}
	
	public boolean contains(int item){
		return indexOf(item)!=-1;
	}
	
	public void removeFirst(){
		Node second = first.next;
		first.next = null;
		first = second;
	}
	
	public void removeLast(){
		   if(first != last ) {  
               Node current = first;  
               while(current.next != last) {  
                   current = current.next;  
               }  
               last = current;  
               last.next = null;  
           }  
           else {  
               first = last = null;  
           }  
       }  
	
	 public String toString() {     
	        String output = "";
	        if(first != null) {    
	        	Node current = first;
	        	
	        	while(current != null) {    
	        		output = output + current.value + " ";    
	        		current = current.next;    
	        	}
	        }
	        return output;
	 }
}
