package ds.stack;

import ds.BasicStack;

public class StackArray<E> {

	private E[] stack;
	private int top;
	private int maxSize;

	public StackArray(int size) {
		this.top = -1;
		this.maxSize = size;
		this.stack = (E[]) new Object[size];
	}

	public int size() {
		return top + 1;
	}

	public void push(E item) throws Exception {
		if (size() >= maxSize)
			throw new Exception("stack full!");
		stack[++top] = item;
	}

	public E pop() throws Exception {
		if (size() == 0)
			throw new Exception();
		return stack[top--];
	}

	public E peak() throws Exception {
		if (size() == 0)
			throw new Exception("stack is empty");
		return stack[top];
	}

	public boolean contains(E item) throws Exception {
		if (size() == 0)
			throw new Exception("stack is empty");
		boolean didFound = false;
		for (int i = top; i > 0; i--) {
			if (stack[i] == item) {
				didFound = true;
				break;
			}

		}
		return didFound;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i = 0; i<= top; i++) {
			sb.append(" " + stack[i]);
		}
		return sb.append(" ]").toString();
	}

	public static void main(String[] args) throws Exception {
		
		StackArray<Integer> stack = new StackArray<Integer>(10);
		stack.push(0);
		stack.push(8);
		stack.push(3);
		stack.push(5);
		stack.push(6);
		stack.push(2);
		System.out.println(stack);

		System.out.println("popElement: " + stack.pop());
		System.out.println("contain 3? " + stack.contains(3));
		System.out.println("stack now: " + stack);
		//System.out.println("fetch out: " + stack.access(3));
		System.out.println("after fetch stack is: " + stack);
		System.out.println("pop: " + stack.pop());
		System.out.println("stack now: " + stack);
		//System.out.println("fetch : " + stack.access(8));
		System.out.println("stack now: " + stack);
		stack.push(10);
		System.out.println("stack now: " + stack);
		System.out.println("pop: " + stack.pop());
		System.out.println("stack now: " + stack);

	}

}
