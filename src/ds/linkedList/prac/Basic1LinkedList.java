package ds.linkedList.prac;

public class Basic1LinkedList<E> {
	Node firstNode;
	Node lastNode;
	int nodeCount;

	public Basic1LinkedList() {
		this.firstNode = null;
		this.lastNode = null;
		this.nodeCount = 0;
	}

	public int size() {
		return this.nodeCount;
	}

	public void add(E item) {
		if (firstNode == null) {
			firstNode = new Node<E>(item, null);
			lastNode = firstNode;

		} else {
			Node newItem = new Node<E>(item, null);
			lastNode.setNextNode(newItem);
			lastNode = newItem;
		}
		nodeCount++;
	}

	public E remove() throws Exception {
		if (firstNode == null)
			throw new Exception("List is empty!");
		E item = (E) firstNode.getNodeItem();
		firstNode = firstNode.getNextNode();
		nodeCount--;
		return item;
	}

	public void insertAt(E item, int position) throws Exception {
		if (position > nodeCount)
			throw new Exception("Illegal argument exception");

		Node tempNode = firstNode;
		if (tempNode == null) {
			firstNode = new Node<E>(item, null);
			lastNode = firstNode;
			nodeCount++;
		} else {
			for (int i = 1; i < position; i++) {
				if (i == position - 1) {
					Node newItem = new Node<E>(item, tempNode.getNextNode());
					tempNode.setNextNode(newItem);
					nodeCount++;
				}
				tempNode = tempNode.getNextNode();

			}
		}

	}

	public E removeAt(int position) throws Exception {
		if (firstNode == null)
			return null;
		E item = null;
		Node tempNode = firstNode;
		for (int i = 1; i < position; i++) {
			if (i == position - 1) {
				item = (E) tempNode.getNextNode().getNodeItem();
				tempNode.setNextNode(tempNode.getNextNode().getNextNode());
				nodeCount--;
			}
			tempNode = tempNode.getNextNode();
		}
		return item;
	}

	public E get(int index) throws Exception {
		if (firstNode == null || index < 0 || index > nodeCount - 1)
			throw new Exception("Illegal argument exception");

		Node tempNode = firstNode;
		for (int i = 0; i <= index; i++) {
			if (i == index)
				return (E) tempNode.getNodeItem();
			tempNode = tempNode.nextNode;
		}

		return null;
	}

	public E getFirst() {
		if (firstNode == null)
			return null;
		return (E) firstNode.getNodeItem();
	}

	public E getLast() throws Exception {
		if (firstNode == null)
			throw new Exception("No elements in list!");
		return (E) lastNode.getNodeItem();

	}

	@Override
	public String toString() {
		if (firstNode == null)
			return "";
		StringBuffer sb = new StringBuffer();
		Node tempNode = firstNode;
		while (tempNode != null) {
			sb.append(tempNode.getNodeItem());
			if (tempNode.getNextNode() != null)
				sb.append(", ");
			tempNode = tempNode.nextNode;
		}
		return sb.toString();
	}

	private class Node<E> {
		private E nodeItem;
		private Node nextNode;

		Node(E nodeItem, Node nextNode) {
			this.nodeItem = nodeItem;
			this.nextNode = nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		public E getNodeItem() {
			return this.nodeItem;
		}

		public Node getNextNode() {
			return this.nextNode;
		}
	}

}
