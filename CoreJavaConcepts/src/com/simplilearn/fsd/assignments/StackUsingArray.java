package com.simplilearn.fsd.assignments;

public class StackUsingArray {
	
	int size; 
	int top1, top2; 
	int arr[];
	
	StackUsingArray(int n) 
	{ 
		arr = new int[n]; 
		size = n;
		top1 = -1;
		top2 = arr.length;
	}

	void push1(int item) {
		if (top1 < top2 - 1){
			top1++;
			arr[top1] = item;
		}
		else{
			System.out.println("Stack Overflow"); 
			System.exit(1); 
		}
	}
	
	void push2(int item){
		if (top1 < top2 -1){
			top2--;
			arr[top2] = item;
		}
		else{
			System.out.println("Stack Overflow"); 
			System.exit(1); 
		}
	}
	   
	int pop1(){
		if (top1 >= 0){
			int item = arr[top1];
			top1--;
	    	return item;
		}
		else{
			System.out.println("Stack Underflow"); 
			System.exit(1); 
		}
		return 0;
	}
	  
	int pop2(){
		if(top2 < size){
			int x =arr[top2];
			top2++;
			return x;
		}
		else{
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}

	public boolean isEmpty1(){
		if(top1 == -1)
			return true;
		return false;
	}

	public boolean isEmpty2(){
		if(top2 == arr.length)
			return true;
		return false;
	}

	public static void main(String args[]){
		StackUsingArray ts = new StackUsingArray(10);
		System.out.println("Stack1 is empty: " + ts.isEmpty1() + "  " + "Stack2 is empty: "+ ts.isEmpty2());
		ts.push1(5); 
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		System.out.println("Stack1 is empty: " + ts.isEmpty1() + "  " + "Stack2 is empty: "+ ts.isEmpty2());
		System.out.println("Element popped from stack1 is " + ts.pop1());
		System.out.println("Element popped from stack1 is " + ts.pop2());
	}
}