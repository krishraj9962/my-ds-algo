package ds;

import java.util.Arrays;

public class BasicStack<E> {

	private E[] data;
	private int stackPointer;
	private static int stackSize = 6;

	@Override
	public String toString() {
		return "BasicStack [data=" + Arrays.toString(data) + ", stackPointer=" + stackPointer + "]";
	}

	public BasicStack() {
		this.data = (E[]) new Object[stackSize];
		this.stackPointer = 0;
		System.out.println("stack length:: " + this.data.length);
	}

	// O(1)
	public void push(E inputData) throws Exception {
		if (this.stackPointer == stackSize)
			throw new Exception("Stack if full!");
		this.data[stackPointer++] = inputData;
	}

	// O(1)
	public E pop() throws Exception {
		if (this.stackPointer == 0)
			throw new Exception("stack is empty!");
		E popData = this.data[--stackPointer];
		this.data[stackPointer] = null;
		return popData;
	}

	// O(n)
	public boolean contains(E element) {
		if (this.stackPointer > 0) {
			for (int i = 0; i < this.stackPointer; i++)
				if (this.data[i] == element)
					return true;
		}
		return false;
	}

	// O(n)
	public E access(E element) throws Exception {
		E output = null;
		boolean didFound = false;
		if (this.stackPointer == 0)
			throw new Exception("stack is empty !");
		for (int i = 0; i <= this.stackPointer; i++) {
			if (this.data[i] == element && !didFound) {
				output = this.data[i];
				didFound = true;
				this.stackPointer--;
			}
			if (didFound) {
				this.data[i] = this.data[i + 1];
				this.data[i + 1] = null;
			}

		}
		return output;
	}

	public int size() {
		return this.stackPointer;
	}

	public boolean isEmpty() {
		return this.stackPointer == 0;
	}

	public static void main(String[] args) throws Exception {
		BasicStack<Integer> stack = new BasicStack<Integer>();
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
		System.out.println("fetch out: " + stack.access(3));
		System.out.println("after fetch stack is: " + stack);
		System.out.println("pop: " + stack.pop());
		System.out.println("stack now: " + stack);
		System.out.println("fetch : " + stack.access(8));
		System.out.println("stack now: " + stack);
		stack.push(10);
		System.out.println("stack now: " + stack);
		System.out.println("pop: " + stack.pop());
		System.out.println("stack now: " + stack);

	}

}
