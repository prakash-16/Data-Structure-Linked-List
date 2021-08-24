package com.bridgelabz.datastructurelinkedlist;

public class LinkedListRunner<K> {
	
	
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printNodes();
		MyNode<Integer> myFourthNode = new MyNode<Integer>(40);
		myLinkedList.addElementInLinkedList(mySecondNode, myFourthNode);
		System.out.println("Linked list after adding element");
		myLinkedList.printNodes();
		
		
	}

}
