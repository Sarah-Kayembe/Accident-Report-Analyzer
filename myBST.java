/*
 * A class representing a Binary Search Tree (BST) to store accident reports.
 * Author: Sarah Kayembe
 * Date: Mon, 4 March, 2024
 * Disclaimer: The code comments were generated using ChatGPT to explain the functionality of the code.
 * StackOverflow was also used for solving errors and addressing missing packages.
 */
package accidentpack;

import java.util.Date;

/**
 * A class representing a Binary Search Tree (BST) to store accident reports.
 */
public class myBST {

    private Node root;

    /**
     * Constructs an empty BST.
     */
    public myBST() {
        this.root = null;
    }

    /**
     * Inserts a report object into the BST.
     * 
     * @param report The accident report to insert.
     * @return true if the report was successfully inserted, false otherwise.
     */
    public boolean insert(Accident report) {
        if (root == null) {
            root = new Node(report);
            return true;
        }
        return insertNode(root, report);
    }

    /**
     * Recursive helper method for insertion.
     * 
     * @param node   The current node being processed.
     * @param report The accident report to insert.
     * @return true if the report was successfully inserted, false otherwise.
     */
    private boolean insertNode(Node node, Accident report) {
        int comparison = report.getStartTime().compareTo(node.data.getStartTime());
        if (comparison < 0) {
            if (node.left == null) {
                node.left = new Node(report);
                updateNodeCount(node);
                return true;
            } else {
                return insertNode(node.left, report);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(report);
                updateNodeCount(node);
                return true;
            } else {
                return insertNode(node.right, report);
            }
        }
    }

    /**
     * Update the node count based on child nodes.
     * 
     * @param node The node whose count needs to be updated.
     */
    private void updateNodeCount(Node node) {
        int leftCount = node.left != null ? node.left.count : 0;
        int rightCount = node.right != null ? node.right.count : 0;
        node.count = 1 + leftCount + rightCount;
    }

    /**
     * Search for reports on or after a date using children count.
     * 
     * @param date The date to search for.
     * @return The number of reports found on or after the given date.
     */
    public int search(Date date) {
        if (root == null) {
            return 0;
        }
        return searchWithCount(root, date);
    }

    /**
     * Recursive helper method for search using children count.
     * 
     * @param node The current node being processed.
     * @param date The date to search for.
     * @return The number of reports found on or after the given date.
     */
    private int searchWithCount(Node node, Date date) {
        if (node == null) {
            return 0;
        }
        int comparison = date.compareTo(node.data.getStartTime());
        if (comparison < 0) {
            return searchWithCount(node.left, date);
        } else {
            // Count includes current node and all right children
            return node.count + searchWithCount(node.right, date);
        }
    }

    /**
     * Recursive search for reports on or after a date (alternative approach).
     * 
     * @param date The date to search for.
     * @return The number of reports found on or after the given date.
     */
    public int recursiveSearch(Date date) {
        if (root == null) {
            return 0;
        }
        return recursiveSearchHelper(root, date);
    }

    /**
     * Helper method for recursive search.
     * 
     * @param node The current node being processed.
     * @param date The date to search for.
     * @return The number of reports found on or after the given date.
     */
    private int recursiveSearchHelper(Node node, Date date) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        if (date.compareTo(node.data.getStartTime()) <= 0) {
            count++; // Include current node
        }
        count += recursiveSearchHelper(node.left, date);
        count += recursiveSearchHelper(node.right, date);
        return count;
    }

    /**
     * Node class for the BST.
     */
    private class Node {
        public Accident data;
        public Node left;
        public Node right;
        public int count; // Number of descendants including itself

        /**
         * Constructs a node with the given accident report data.
         * 
         * @param data The accident report data.
         */
        public Node(Accident data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.count = 1; // Initially 1 for itself
        }
    }
}

