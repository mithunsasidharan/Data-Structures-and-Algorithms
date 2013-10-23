package com.programs.bst;

/*
 * BASIC NODE STORED IN A TREE.
 */
class Node {
	public int element;
	public Node left;
	public Node right;

	// CONSTRUCTORS 
	public Node(int theElement) {
		this(theElement, null, null);
	}

	public Node(int theElement, Node lLink, Node rLink) {
		element = theElement;
		this.left = lLink;
		this.right = rLink;
	}
}
