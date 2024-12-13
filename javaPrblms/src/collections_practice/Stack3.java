package collections_practice;

import java.util.Stack;

public class Stack3 {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<>();
		stk.push("apple");
		stk.push("banana");
		stk.push("mango");
		System.out.println(stk);
		String fruit=stk.peek();
		System.out.println("element at top:"+fruit);

		System.out.println("Stack elements are : " + stk); 
	}

}
