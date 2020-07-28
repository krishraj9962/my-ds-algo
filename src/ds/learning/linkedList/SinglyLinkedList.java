package ds.learning.linkedList;

public class SinglyLinkedList<E> {

	private Node<E> first;
	private Node<E> last;
	long size;

	public SinglyLinkedList() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public void insertFirst(E item) {
		Node newItem = new Node<E>(item);
		if(isEmpty()) {			
			first = newItem;
			last = first;				
		}else {
			newItem.next = first;
			first = newItem;
		}
		size++;
	}
	
	public E removeFirst() throws Exception {
		if(isEmpty())
			throw new Exception("List is Empty!");
		E item = first.item;
		first = first.next;
		size--;
		return item;
	}	
	
	public void insertLast(E item) {
		Node nItem = new Node<E>(item);
		if(isEmpty()) {
			this.first = nItem;
			this.last = first;
		}else {			
			last.next = nItem;
			last = nItem;
		}
		size++;	
	}
	
	public E peekFirst() {
		return first.item;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public long size() {
		return size;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[ ");
		Node tempNode = first;
		while(tempNode !=null) {
			sb.append(tempNode.item + " ");
			tempNode = tempNode.next;
		}
		sb.append(" ]");
		return sb.toString();
	}

	private class Node<E> {
		private E item;
		private Node next;

		Node(E item) {
			this.item = item;
		}
	}

}
