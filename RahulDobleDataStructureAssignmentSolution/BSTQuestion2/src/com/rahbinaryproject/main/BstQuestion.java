package com.rahbinaryproject.main;

public class BstQuestion {

	static class Node {
		int key;
		Node left, right;

		Node(int data) {
			key = data;
			left = right = null;
		}
	}

	public static Node root;

	// initial values for skewed tree
	static Node previousNode = null;
	static Node headNode = null;

	// method for converting binary search tree to right skewed tree
	static void bstToSkewed(Node root, int order) {
		if (root == null) {
			return;
		}
		if (order > 0) {
			bstToSkewed(root.right, order);

		} else {
			bstToSkewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;// if root is null
			// then insert value in it
			root.left = null;
			previousNode = root;
		} else {
			previousNode.right = root;
			root.left = null;
			previousNode = root;
		}
		if (order > 0) {
			bstToSkewed(leftNode, order);

		} else {
			bstToSkewed(rightNode, order);
		}
	}

	// traverse through the skewed tree
	static void traverseSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.key + " ");
		traverseSkewed(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// values inserted in binary tree
		BstQuestion tree1 = new BstQuestion();
		tree1.root = new Node(50);
		tree1.root.left = new Node(30);
		tree1.root.right = new Node(60);
		tree1.root.left.left = new Node(10);
		tree1.root.right.left = new Node(55);

		bstToSkewed(root, 0);// converting binary search tree to right skewed tree
		traverseSkewed(headNode);

	}
}
