package ds.learning.tree;

public class BinarySearchTree {

	private Node root;
	private int size;

	public boolean insertNode(int item) {
		Node nItem = new Node(item);
		boolean wasOkay = false;

		if (isEmpty()) {
			root = nItem;
			return wasOkay = true;
		} else {
			Node current = root;

			while (true) {
				if (item <= current.value) {
					if (current.leftChild == null) {
						current.leftChild = nItem;
						wasOkay = true;
						break;
					} else {
						current = current.leftChild;
					}
				} else {
					if (current.rightChild == null) {
						current.rightChild = nItem;
						wasOkay = true;
						break;
					} else {
						current = current.rightChild;
					}
				}
			}
			return wasOkay;
		}
	}

	public int findMin() throws Exception {
		if (isEmpty())
			throw new Exception("Tree is empty");
		Node current = root;
		while (true) {
			if (current.leftChild == null)
				return current.value;
			current = current.leftChild;
		}

	}

	public int findMax() throws Exception {
		if (isEmpty())
			throw new Exception("Tree is empty!");
		Node current = root;
		while (true) {
			if (current.rightChild == null)
				return current.value;
			current = current.rightChild;

		}
	}

	public boolean deleteNode(int item) throws Exception {

		// 1 Find the node to be deleted
		// 2 Handle if its a leaf node.
		// 3 Handle if it has only one child.
		// a) Handle if it has only left child
		// b) Handle if it has only right child.
		// 4 Handle if it has both the child.

		Node currentNode = root;
		Node parentNode = root;
		boolean isLeftNode = false;
		if (isEmpty())
			throw new Exception("tree is empty!");

		while (currentNode.value != item) {
			parentNode = currentNode;
			if (item < currentNode.value) {
				isLeftNode = true;
				currentNode = currentNode.leftChild;
			} else {
				isLeftNode = false;
				currentNode = currentNode.rightChild;
			}
			if (currentNode == null) {
				return false;
			}
		}

		Node nodeToDelete = currentNode;

		// handle for leaf node
		if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
			// Its a leaf node.
			if (nodeToDelete == root) {
				root = null;
				return true;
			}
			if (isLeftNode) {
				parentNode.leftChild = null;
			} else {
				parentNode.rightChild = null;
			}

		} else if (nodeToDelete.leftChild == null) {
			// It has one right child
			if(isLeftNode) {
				parentNode.leftChild = nodeToDelete.rightChild;
			}else {
				parentNode.rightChild = nodeToDelete.rightChild;
			}
		} else if (nodeToDelete.rightChild == null) {
			// It has one left child
			if(isLeftNode) {
				parentNode.leftChild = nodeToDelete.leftChild;
			}else {
				parentNode.rightChild = nodeToDelete.leftChild;
			}
		} else {
			// It has both the child.
			
			
			
			
			
			
			
			
		}

		return true;
	}

	public boolean isEmpty() {
		return root == null;
	}

	private class Node {
		int value;
		Node leftChild;
		Node rightChild;

		Node(int value) {
			this.value = value;
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Integer.toString(this.root.value);
	}

}
