package ds.linkedList;

public class Node<E> {
	
	private E nodeItem;
	private Node nextNode;
		
	Node(E item, Node nextNode){
		this.nodeItem = item;
		this.nextNode = nextNode;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	public Node getNextNode() {
		return this.nextNode;
	}
	
	public E getNodeItem() {
		return this.nodeItem;
	}

}
