package com.programs.bst;

public class BST {
	public Node root;

	public BST(int data) { // ONLY CONSTRUCTOR//
		root = new Node(data);
	}

	public Node insert(Node node, Integer x) {
		if (node == null) {
			return node = new Node(x);
		}
		if (x < node.element) {
			node.left = insert(node.left, x);
		} else {
			node.right = insert(node.right, x);
		}
		return node;
	}

	// IN-ORDER TRAVERSAL(LEFT->ROOT->RIGHT)
	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.element + ",");
			inOrder(node.right);
		}
	}

	// PRE-ORDER TRAVERSAL(ROOT->LEFT->RIGHT)
	public void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.element + ",");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	// POST-ORDER TRAVERSAL(LEFT->RIGHT->ROOT)
	public void postOrder(Node node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.element + ",");
		}
	}

	// RIGHT->ROOT->LEFT TRAVERSAL OF TREE FOR GETTING ELEMENTS IN DESCENDING
	// ORDER//
	public void descOrder(Node node) {
		if (node != null) {
			descOrder(node.right);
			System.out.print(node.element + ",");
			descOrder(node.left);
		}
	}

	public boolean search(Node root, int value) {
		if (value == root.element)
			return true;
		else if (value < root.element) {
			if (root.left == null)
				return false;
			else
				return search(root.left, value);
		} else if (value > root.element) {
			if (root.right == null)
				return false;
			else
				return search(root.right, value);
		}
		return false;
	}

	public void findNextLarget(int data){

	}

	//MAIN METHOD//
	public static void main(String args[]) {

		// THE SOURCE OF ELEMENTS TO SORT//
		int[] arr = { 7, 1, 0, 3, 2, 5, 4, 6, 9, 8, 10 };
		BST bst = new BST(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			bst.insert(bst.root, arr[i]);
		}
		System.out.print("Elements in Increasing Order: ");
		bst.inOrder(bst.root);
		System.out.println();

		System.out.print("Elements in Decreasing Order: ");
		bst.descOrder(bst.root);
		System.out.println();

		System.out.print("Elements in Pre Order :");
		bst.preOrder(bst.root);
		System.out.println();

		System.out.print("Elements in Post Order :");
		bst.postOrder(bst.root);
		System.out.println();

		System.out.println(bst.search(bst.root,23));
	}
}
