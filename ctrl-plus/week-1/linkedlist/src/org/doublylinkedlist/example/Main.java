package org.doublylinkedlist.example;

public class Main {
	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		System.out.println("Is the list empty? " + doublyLinkedList.isEmpty());

		doublyLinkedList.add(10);
		doublyLinkedList.add(20);
		doublyLinkedList.add(30);
		doublyLinkedList.add(40);

		System.out.println("Is the list empty? " + doublyLinkedList.isEmpty());

		doublyLinkedList.display();

		System.out.println("Is 25 exist? " + doublyLinkedList.isExist(25));

		doublyLinkedList.insert(50, 2);
		doublyLinkedList.display();

		doublyLinkedList.remove(30);
		doublyLinkedList.display();

		doublyLinkedList.removeAtIndex(3);
		doublyLinkedList.display();

		DoublyLinkedListNode node = doublyLinkedList.nodeAtIndex(1);
		if (node != null) {
			System.out.println("Node at index 1: " + node.data);
		}

		int size = doublyLinkedList.size();
		System.out.println("Size of the list: " + size);
	}
}
