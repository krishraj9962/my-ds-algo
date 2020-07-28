package ds.learning.linkedList;

public class DoublyLinkedList<E> {

	private Node<E> first;
	private Node<E> last;
	private long size;

	public DoublyLinkedList() {
		this.size = 0;
	}

	public void insertFirst(E item) {
		Node nNode = new Node<E>(item);
		if (isEmpty()) {
			first = nNode;
			last = first;
		} else {
			first.prev = nNode;
			nNode.next = first;
			first = nNode;

		}
		size++;
	}

	public E removeFirst() throws Exception {
		E item = null;
		if (isEmpty())
			throw new Exception("list is empty");
		item = first.nodeItem;
		if(first.next == null) {
			first = null;
			last = null;
		}else {
			first.next.prev = first.prev;
			first = first.next;
		}		
		size--;
		return item;
	}
	
	public E removeLast() throws Exception {
		if(isEmpty())
			throw new Exception("list is empty");
		E item = last.nodeItem;
		if(first.next == null) {
			first = null;
			last = null;
		}else {
			last = last.prev;
			last.next = null;
		}		
		return item;
	}

	public void insertLast(E item) {
		Node nNode = new Node<E>(item);
		if (isEmpty()) {
			first = nNode;
			last = first;
		} else {
			this.last.next = nNode;
			nNode.prev = last;
			last = nNode;
		}
		size++;
	}

	public E peakFirst() {
		return first.nodeItem;
	}

	public E peakLast() {
		return last.nodeItem;
	}

	public long size() {
		return size;
	}

	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node<E> tempNode = first;
		while (tempNode != null) {
			sb.append(tempNode.nodeItem );			
			tempNode = tempNode.next;
			if(tempNode != null)
				sb.append(" ");
		}
		sb.append("]");
		return sb.toString();
	}

	private class Node<E> {
		private E nodeItem;
		private Node<E> next;
		private Node<E> prev;

		Node(E item) {
			this.nodeItem = item;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}

	}

}
