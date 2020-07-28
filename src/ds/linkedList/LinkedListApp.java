package ds.linkedList;

public class LinkedListApp {

	public static void main(String[] args) throws Exception {
		BasicLinkedList<Integer> myList = new BasicLinkedList<Integer>();

		System.out.println("size: " + myList.size());
		myList.add(5);
		myList.add(8);
		myList.add(6);
		myList.add(3);
		myList.add(1);
		myList.add(2);
		System.out.println("MyList: " + myList);
		System.out.println("size: " + myList.size());
		System.out.println("removeItem: " + myList.remove());
		System.out.println("removeItem: " + myList.remove());
		System.out.println("size: " + myList.size());
		System.out.println("MyList: " + myList);
		myList.insertAt(4, 3);
		System.out.println("MyList: " + myList);
		myList.insertAt(5, 4);
		System.out.println("MyList: " + myList);
		System.out.println("Remove at position 4: " + myList.removeAt(4));
		System.out.println("MyList: " + myList);
		System.out.println("Remove at position 4: " + myList.removeAt(4));
		System.out.println("MyList: " + myList);
		System.out.println("size: " + myList.size());
		System.out.println("getItem at positon one: " + myList.get(1));
		
		
		
	}

}
