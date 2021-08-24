package com.bridgelabz.datastructurelinkedlist;

public class LinkedListRunner {
	
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printNodes();
		myLinkedList.popLast();
		System.out.println("After deletion of last element");
		myLinkedList.printNodes();
	}

}
