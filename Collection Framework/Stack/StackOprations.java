package com.anisha.collectionfw.stack;

import java.util.Stack;

// Stack : stack is child class of vector & follows LIFO order
public class StackOprations {

	public static void main(String[] args) {
		Stack<String> names = new Stack<>();

//	1.push() : insertion
		names.push("Anisha");
		names.push("Sanvii");
		names.push("Abhii");
		names.push("Apuu");

//	2.search : returns idx  
		System.out.println(names.search("Abhii")); // 2

//	3.pop() : deletion
		names.pop();
		System.out.println(names); // [Anisha, Sanvii, Abhii]

//	4.peek()  : return  last element
		System.out.println(names.peek()); // Abhii

//	5.size() 
		System.out.println(names.size()); // 3

//	6.empty
		System.out.println(names.empty()); // false

//	7.clear() 
		names.clear();
		System.out.println(names.empty()); // true

	}

}
