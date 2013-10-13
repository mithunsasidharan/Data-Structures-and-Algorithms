package com.programs.linkedlist;

public class LinkedList {

	public Node node;

	public LinkedList(){
		this.node = null;
	}

	public void addToFront(int data){
		Node newNode = new Node(data);
		newNode.next = node;
		node = newNode;
	}

	public void addToEnd(int data){
		Node newNode = new Node(data);
		Node temp = node;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void display(){
		while(node != null){
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addToFront(1);
		list.addToFront(2);
		list.addToFront(3);
		list.addToEnd(4);
		list.display();
	}
}
