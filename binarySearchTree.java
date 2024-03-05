/**
 * binarySearchTree - A class which extends the BinaryTree;
 * used for sorting ad manipulating data in a linkedlist
 * @author Professor Mansouri and esther greene
 * @version March 4, 2024
 */

package accidentpack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class binarySearchTree <E extends Comparable<E>> extends BinaryTree<E> {
	myLinkedList linkedlist;
	/**
	 * binarySearchTree A constructor for the binarySearchTree class
	 * @param linkedlist2 A List of type Report used to create a new binarySearchTree
	 */
	public binarySearchTree(myLinkedList linkedlist2)
	{
		this.linkedlist=(myLinkedList) linkedlist2;
	}
	
	/**
	 * find Used to find an object in the binarySearchTree
	 * @param target The object to be found
	 * @return find(root, target) 
	 */
	public E find(E target) {
		return find(root, target);
	} // end of find method
	
	/**
	 * find A recursive used to find an object in the binarySearchTree
	 * @param localRoot the Node to be searched
	 * @param target The object to be found
	 * @return null if null, left if left, right if right; returns the data found at the target
	 */
	private E find(Node<E> localRoot, E target) {
		if (localRoot == null)
			return null;
		// Compare the target with the data field at the root.
		int compResult = target.compareTo(localRoot.data);
		if (compResult == 0)
			return localRoot.data;
		else if (compResult < 0)
			return find(localRoot.left, target);
		else
			return find(localRoot.right, target);
	} // end of find constructor
	
	/**
	 * add Adds an item to the binarySearchTree
	 * @param item Item to be added
	 * @return true OR false depending on the parameters
	 */
	public boolean add(E item) {
		if (root == null) {
			root = new Node<E>(item);
			return true;
		}
		Node<E> localRoot = root;
		for(;;) {
			int cmp = item.compareTo(localRoot.data);
			if (cmp == 0)
				return false;
			else if (cmp < 0) {
				if (localRoot.left != null)
				localRoot = localRoot.left;
				else {
					localRoot.left = new Node<E>(item);
					return true;
				}
			} else {
				if (localRoot.right != null)
					localRoot = localRoot.right;
				else {
					localRoot.right = new Node<E>(item);
					return true;
				}
			}
		}

	} // end of add method
} // end of binarySearchTree class
