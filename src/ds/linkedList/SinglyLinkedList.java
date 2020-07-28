package ds.linkedList;

public class SinglyLinkedList<E> {

	private Node<E> first;
	private long size;

	public SinglyLinkedList() {
		this.size = 0;
	}

	public void addFirst(E e) {
		Node<E> newNode = new Node<E>(e);
		newNode.next = first;
		first = newNode;
		size++;
	}

	public E removeFirst() throws Exception {
		if (size == 0)
			throw new Exception("List is empty!");
		E data = (E) first.data;
		first = first.next;
		size--;
		return data;
	}

	public void addLast(E data) {
		Node<E> nNode = new Node(data);
		if (size == 0)
			first = nNode;
		else {
			Node current = first;
			while (current != null) {
				if (current.next == null) {
					current.next = nNode;
					break;
				}
				current = current.next;
			}

		}
		size++;
	}

	public E removeLast() throws Exception {
		if (size == 0)
			throw new Exception("list is empty");

		Node<E> current = first;
		E data = null;
//		if(size == 1) {
//			data = first.data;
//			first = null;
//			size--;
//			return data;
//		}
			
		for(int i = 2; i <= size -1 && current != null; i++) {
			current = current.next;
		}
		data = current.next.data;
		current.next = null;
		size--;		
		return data;
	}
	
	public E removeAt(int index) throws Exception {
		if(size == 0 || index >= size)
			throw new Exception("Invalid argument");
		E data = null;
		if(index == 0) {
			data = first.data;
			first = first.next;
			size--;
			return data;
		} else {
			Node<E> current = first;
			for(int i = 1; i <= index -1 && current != null; i++) {
				current = current.next;
			}
			data = current.next.data;
			current.next = current.next.next;
			size--;
			return data;			
		}		
		
	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer();
		Node<E> current = first;
		while (current != null) {
			sb.append(current.data + " ");
			current = current.next;
		}

		return sb.toString();

	}

	public long size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private class Node<E> {
		private E data;
		private Node<E> next;

		public Node(E data) {
			this.data = data;
		}

		public E getData() {
			return this.data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node getNext() {
			return this.next;
		}
	}

}
