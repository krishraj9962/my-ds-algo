package ds.learning.linkedList;

public class DoublyLinkedListApp {

	public static void main(String[] args) throws Exception {
		DoublyLinkedList<Integer> myDLinkedList = new DoublyLinkedList<Integer>();
		
		myDLinkedList.insertFirst(10);
		myDLinkedList.insertFirst(40);
		myDLinkedList.insertFirst(20);
		myDLinkedList.insertFirst(30);
		myDLinkedList.insertFirst(80);
		System.out.println(myDLinkedList);
		System.out.println("Remove First: " + myDLinkedList.removeFirst());
		System.out.println(myDLinkedList);
		System.out.println("Remove First: " + myDLinkedList.removeFirst());
		System.out.println(myDLinkedList);
		
		DoublyLinkedList<Integer> myDLinkedListQueue = new DoublyLinkedList<Integer>();
		
		myDLinkedListQueue.insertLast(2);
		myDLinkedListQueue.insertLast(5);
		myDLinkedListQueue.insertLast(3);
		myDLinkedListQueue.insertLast(1);
		myDLinkedListQueue.insertLast(4);
		myDLinkedListQueue.insertLast(8);
		System.out.println("My queus initial: " + myDLinkedListQueue);
		System.out.println("removeFromQueus: " + myDLinkedListQueue.removeFirst());
		System.out.println("removeFromQueus: " + myDLinkedListQueue.removeFirst());
		System.out.println("My queus initial: " + myDLinkedListQueue);
		System.out.println("adding at the end agaiin: ");
		myDLinkedListQueue.insertLast(10);
		myDLinkedListQueue.insertLast(11);
		System.out.println("My queus initial: " + myDLinkedListQueue);
		
		System.out.println("removeFromQueus: " + myDLinkedListQueue.removeFirst());
		System.out.println("My queus initial: " + myDLinkedListQueue);
		System.out.println("removeFromQueus: " + myDLinkedListQueue.removeFirst());
		System.out.println("My queus initial: " + myDLinkedListQueue);
		System.out.println("removeFromQueus: " + myDLinkedListQueue.removeFirst());
		System.out.println("My queus initial: " + myDLinkedListQueue);
		System.out.println("removeFromQueus: " + myDLinkedListQueue.removeFirst());
		System.out.println("removeFromQueus: " + myDLinkedListQueue.removeFirst());
		System.out.println("My queus initial: " + myDLinkedListQueue);		
		System.out.println("removeFromQueus: " + myDLinkedListQueue.removeFirst());
		System.out.println("My queus initial: " + myDLinkedListQueue);
		

	}

}
