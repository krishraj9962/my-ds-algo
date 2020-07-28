package ds.learning;

import java.util.Stack;

public class ReversStringUsingStack {
	
	
	
	public static void reverseString(String input) {
		char[] strArr = input.toCharArray();
		Stack tempStack = new Stack();
		for (int i = 0; i< strArr.length; i++) {			
			tempStack.push(strArr[i]);			
		}
		
		while(!tempStack.isEmpty()) {
			System.out.print(tempStack.pop());
		}
	}

	
	public static void main(String[] args) {
		reverseString("happy");
		System.out.println();
		reverseString("how are you");
	}

}
