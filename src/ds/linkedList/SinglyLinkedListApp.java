package ds.linkedList;

public class SinglyLinkedListApp {

	public static void main(String[] args) throws Exception {
		SinglyLinkedList<Integer> mySLL = new SinglyLinkedList<Integer>();
		
		//mySLL.addFirst(8);
//		mySLL.addFirst(1);
//		mySLL.addFirst(9);
//		mySLL.addFirst(7);
//		System.out.println(mySLL);
//		
//		System.out.println("removing First: " +  mySLL.removeFirst());
//		
//		System.out.println(mySLL);
//		
//		System.out.println("adding at last");
//		mySLL.addLast(0);
//		mySLL.addLast(2);
//		mySLL.addLast(3);
//		System.out.println("current size: " + mySLL.size());
//		System.out.println(mySLL);
//		System.out.println("Removing from last: " + mySLL.removeLast());
//		System.out.println(mySLL);
//		System.out.println("current size: " + mySLL.size());
//		System.out.println("Removing from last: " + mySLL.removeLast());
//		System.out.println(mySLL);
		mySLL.addFirst(8);
		mySLL.addFirst(10);
		mySLL.addFirst(12);
		System.out.println(mySLL);
		System.out.println("removing: " + mySLL.removeLast());
		System.out.println(mySLL);
		
	}

}
