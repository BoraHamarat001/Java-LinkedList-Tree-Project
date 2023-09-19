package LİnkedList;

public class Tree {
	
	    private Node root;

	    public Tree() {
	        root = null;
	    }

	    private class Node {
	        private String value;
	        private Node leftChild;
	        private Node rightChild;

	        public Node(String value) {
	            this.value = value;
	            leftChild = null;
	            rightChild = null;
	        }
	    }

	    public void insert(String value) {
	        root = insertRecursive(root, value);
	    }

	    private Node insertRecursive(Node current, String value) {
	        if (current == null) {
	            return new Node(value);
	        }

	        if (current.leftChild == null) {
	            current.leftChild = insertRecursive(current.leftChild, value);
	        } else {
	            current.rightChild = insertRecursive(current.rightChild, value);
	        }

	        return current;
	    }

	    public String toString() {
	        StringBuffer buff = new StringBuffer("");
	        traversePreOrderRecursive(root, buff);
	        return buff + "";
	    }

	    private void traversePreOrderRecursive(Node current, StringBuffer buff) {
	        if (current != null) {
	            buff.append("-->" + current.value);
	            traversePreOrderRecursive(current.leftChild, buff);
	            traversePreOrderRecursive(current.rightChild, buff);
	        }
	    }
	}

