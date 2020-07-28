package ds.learning.linkedList;

public class SingleLinkListApp {
	
	public static void main(String[] args) throws Exception {
		SinglyLinkedList<Integer> myList = new SinglyLinkedList<Integer>();
		
		myList.insertFirst(20);
		myList.insertFirst(30);
		myList.insertFirst(10);
		myList.insertFirst(60);
		myList.insertFirst(50);
		System.out.println("my listis: " + myList);
		System.out.println("peakFirst: " + myList.peekFirst());
		System.out.println("RemoveFirst; " + myList.removeFirst());
		System.out.println("my listis: " + myList);
		
		SinglyLinkedList<Integer> myListQueue = new SinglyLinkedList<Integer>();
		myListQueue.insertLast(1);
		myListQueue.insertLast(5);
		myListQueue.insertLast(3);
		myListQueue.insertLast(6);
		myListQueue.insertLast(8);
		myListQueue.insertLast(7);
		System.out.println("My ques: " + myListQueue);
		System.out.println("removeingFrom Queue: " + myListQueue.removeFirst());
		System.out.println("removeingFrom Queue: " + myListQueue.removeFirst());
		System.out.println("My ques: " + myListQueue);
		System.out.println("adding at the end: ");
		myListQueue.insertLast(7);
		System.out.println("My ques: " + myListQueue);
		System.out.println("removeingFrom Queue: " + myListQueue.removeFirst());
		System.out.println("My ques: " + myListQueue);
		
		
		
	}

}
