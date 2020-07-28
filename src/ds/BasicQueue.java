package ds;

import java.util.Arrays;

public class BasicQueue<E> {
	
	@Override
	public String toString() {
		return "BasicQueue [front=" + front + ", end=" + end + ", elementData=" + Arrays.toString(elementData) + "]";
	}

	private int front;
	private int end;
	private E[] elementData;
	private static int DEFAULT_SIZE = 10;
	
	public BasicQueue() {
		this(DEFAULT_SIZE);
	}
	
	public BasicQueue(int size) {
		elementData = (E[]) new Object[size];
		this.front = -1;
		this.end = -1;
	}
	
	public int size() {
		if(front == -1 && end == -1)
			return 0;
		return this.end - this.front + 1;
	}
	
	public E enqueue(E data) throws Exception {
		if(this.size() >= DEFAULT_SIZE)
			throw new Exception("quesue is full!");
		else if(size() == 0) {
			elementData[++end] = data;
			front++;
		}else {
			elementData[++end] = data;
		}
		
		return data;
	}
	
	public E dequeue() throws Exception {
		E elementToDeques;
		if(this.size() == 0)
			throw new Exception("queue is empty!");
		elementToDeques = elementData[front];
		elementData[front++] = null;
		return elementToDeques;
		
	}
	
	public boolean contains(E data){
		boolean found = false;
		for(int i = front; i <= end; i++) {
			if(elementData[i] == data) {
				found = true;
				break;
			}				
		}		
		return found;
	}
	
	
	
	public static void main(String[] args) throws Exception {
		BasicQueue<Integer> queue = new BasicQueue<Integer>();		
		queue.enqueue(5);
		queue.enqueue(3);
		queue.enqueue(6);
		queue.enqueue(4);
		queue.enqueue(1);
		queue.enqueue(2);
		System.out.println("size: " + queue.size());
		System.out.println(queue);
		System.out.println("dequing: " + queue.dequeue());
		System.out.println("size: " + queue.size());
		System.out.println("Enquing: " + queue.enqueue(10));
		System.out.println("size: " + queue.size());
		System.out.println(queue);
		System.out.println("dequing: " + queue.dequeue());
		System.out.println("dequing: " + queue.dequeue());
		System.out.println("dequing: " + queue.dequeue());
		System.out.println(queue);
		System.out.println("continas 10? " + queue.contains(10));
		
		
	}
}
