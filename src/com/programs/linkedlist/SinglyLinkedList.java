/*package com.programs.linkedlist;
class LinkList {

	private Node start;

	public Node getStart() {
		return start;
	}

	public void setStart(Node start) {
		this.start = start;
	}

	//LinkList constructor
	public LinkList() {
		start = null;
	}

	//Returns true if list is empty
	public boolean isEmpty() {
		return start == null;
	}

	//Inserts a new Link at the first of the list
	public void insertToFront(int data) {
		Node link = new Node(data, null);
		link.next = start;
		start = link;
	}

	//Inserts a new Link at the end of the list
	public void insertToEnd(int data, Node node) {
		if(node.next == null){
			Node newNode = new Node(data, null);
			node.next = newNode;
			return;
		}
		else{
			node = node.next;
			insertToEnd(data, node);
		}

	}

	    //Deletes the link at the first of the list
    public Link delete() {
	    Link temp = first;
	    first = first.nextLink;
	    return temp;
    }
	 
	//Prints list data
	public void printList() {
		Node currentLink = start;
		System.out.print("List: ");
		while(currentLink != null) {
			currentLink.display();
			currentLink = currentLink.next;
		}
		System.out.println("");
	}
}  

class LinkListTest {
	public static void main(String[] args) {
		LinkList list = new LinkList();

		list.insertToEnd(1, list.getStart());
		list.insertToEnd(2, list.getStart());
		list.insertToEnd(3, list.getStart());
		list.insertToEnd(4, list.getStart());
		list.insertToEnd(5, list.getStart());

		//list.printList();

		while(!list.isEmpty()) {
			Link deletedLink = list.delete();
			System.out.print("deleted: ");
			deletedLink.printLink();
			System.out.println("");
		}
		list.printList();
	}
}*/