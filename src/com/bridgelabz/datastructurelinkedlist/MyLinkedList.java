package com.bridgelabz.datastructurelinkedlist;

public class MyLinkedList {
	private INode head;
	private INode tail;
	private int i = 1;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = tail;
	}
	
	public void add(INode node) {
		if(this.head == null) {
			this.head = node;
		}
		if(this.tail == null) {
			this.tail = node;
		}
		else {
			INode tempNode = this.head;
			if(this.head.equals(this.tail)) {
				tempNode.setNext(node);
			}
			else {
				this.tail.setNext(node);
			}
			this.tail = node; 
			
		}
	}
	
	public void insert(INode node) {
		node.setNext(this.tail);
		this.head.setNext(node); 
	}
	
	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while(tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
	

}
