package ds.learning.tree;

public class BSTApp {
	
	public static void main(String[] args) throws Exception {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		System.out.println(tree.insertNode(5));
		tree.insertNode(3);
		tree.insertNode(8);
		tree.insertNode(10);
		tree.insertNode(10);
		tree.insertNode(10);
		tree.insertNode(31);
		tree.insertNode(-6);
		tree.insertNode(42);
		tree.insertNode(35);
		tree.insertNode(98);
		System.out.println("success with min: " + tree.findMin());
		System.out.println("Max is: " + tree.findMax());
	}

}
