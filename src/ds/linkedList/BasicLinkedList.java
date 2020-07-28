package ds.linkedList;

public class BasicLinkedList<E> {

	Node<E> firstNode;
	Node<E> lastNode;
	int nodeCount;

	public BasicLinkedList() {
		this.firstNode = null;
		this.lastNode = null;
		this.nodeCount = 0;
	}

	public int size() {
		int size = 0;
		if (firstNode == null)
			return size;
		Node currentNode = this.firstNode;
		while (currentNode != null) {
			size++;
			currentNode = currentNode.getNextNode();
		}
		return size;
	}

	// O(1)
	public void add(E item) {
		if (firstNode == null) {
			firstNode = new Node<E>(item, null);
			lastNode = firstNode;
		} else {
			Node newNode = new Node<E>(item, null);
			lastNode.setNextNode(newNode);
			lastNode = newNode;
		}
		nodeCount++;
	}

	// O(1)
	public E remove() throws Exception {
		if (firstNode == null)
			throw new Exception("Cant remove from Empty List");
		E item = firstNode.getNodeItem();
		firstNode = firstNode.getNextNode();
		return item;
	}

	// O(n)
	public void insertAt(E item, int position) throws Exception {
		if (firstNode == null || position > nodeCount)
			throw new Exception("Illegal argument exception");

		Node currentNode = firstNode;
		for (int i = 1; i < position; i++) {
			if (i == position - 1) {
				Node<E> newNode = new Node<E>(item, currentNode.getNextNode());
				currentNode.setNextNode(newNode);
				this.nodeCount++;
				return;
			}
			currentNode = currentNode.getNextNode();
		}

	}

	// O(n)
	public E removeAt(int position) {
		E item = null;
		if (firstNode == null)
			return null;
		Node currentNode = firstNode;
		for (int i = 1; i < position; i++) {
			if (i == position - 1) {
				item = (E) currentNode.getNextNode().getNodeItem();
				currentNode.setNextNode(currentNode.getNextNode().getNextNode());
				nodeCount--;
				return item;
			}
			currentNode = currentNode.getNextNode();
		}
		return item;
	}

	// O(n)
	public E get(int position) throws Exception {
		E item = null;
		if (firstNode == null)
			throw new Exception("List is empty!");
		Node currentNode = firstNode;
		for (int i = 1; i <= position; i++) {
			if (i == position) {
				item = (E) currentNode.getNodeItem();
				return item;
			}
			currentNode = currentNode.getNextNode();
		}

		return item;
	}

	@Override
	public String toString() {
		StringBuffer sBuf = new StringBuffer();
		Node curreNode = firstNode;
		if (curreNode == null)
			return sBuf.toString();
		do {
			sBuf.append(curreNode.getNodeItem());
			if (curreNode.getNextNode() != null)
				sBuf.append(", ");
			curreNode = curreNode.getNextNode();
		} while (curreNode != null);

		return sBuf.toString();
	}

}
