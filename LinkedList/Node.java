package com.programs.linkedlist;
class Node {
	public int data;
	public Node next;

	//Link constructor
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	public void display(){
		System.out.println(data);
	}
}