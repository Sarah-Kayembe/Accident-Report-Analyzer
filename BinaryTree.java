/**
 * BinaryTree - A class used to create a BinaryTree
 * used for sorting ad manipulating data in a linkedlist
 * @author Professor Mansouri and esther greene
 * @version March 4, 2024
 */

package accidentpack;

public class BinaryTree<E> {
	protected Node<E> root;
	
	/**
	 * Node A class used to create a Nodes
	 * for the Binary Tree (each having two pointers)
	 * @param <E> Node object of type E (placeholder)
	 */
	protected static class Node<E> {
		E data;
		Node <E> left;
		Node <E> right;
		// node constructor
		public Node(E data) {
		this.data = data;
		left = null;
		right = null;
		}
	}
	
	/**
	 * BinaryTree constructor
	 */
	public BinaryTree() {
		root = null;
	}
	
	/**
	 * A helper method of inOrderPrint
	 * used to print the contents of a 
	 * BinaryTree in order
	 */
	public void inOrderPrint() {
		inOrderPrint(root);
	}
	
	/**
	 * inOrderPrint A constructor for the inOrderPrint
	 * method. Used to print the contents of a
	 * BinaryTree in order
	 * @param node A new Node of type E
	 */
	private void inOrderPrint(Node<E> node) {
		if (node == null) return; // base case
		inOrderPrint(node.left); // left
		System.out.print(node.data); // root
		inOrderPrint(node.right); // right
	}

}
