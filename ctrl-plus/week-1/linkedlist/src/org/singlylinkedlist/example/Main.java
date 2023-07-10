package org.singlylinkedlist.example;

public class Main {
	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		System.out.println("Is the list empty? : " + singlyLinkedList.isEmpty());

		singlyLinkedList.add(1);
		singlyLinkedList.add(2);
		singlyLinkedList.add(3);

		System.out.println("Is the list empty? : " + singlyLinkedList.isEmpty());

		singlyLinkedList.display();

		boolean found = singlyLinkedList.isExist(2);
		System.out.println("Found 2: " + found);

		singlyLinkedList.insert(4, 1);
		singlyLinkedList.display();

		singlyLinkedList.remove(2);
		singlyLinkedList.display();

		singlyLinkedList.removeAtIndex(0);
		singlyLinkedList.display();

		SinglyLinkedListNode node = singlyLinkedList.nodeAtIndex(1);
		if (node != null) {
			System.out.println("Node at index 1: " + node.data);
		}

		int size = singlyLinkedList.size();
		System.out.println("Size of the list: " + size);
	}
}
