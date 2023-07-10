package org.circularlinkedlist.example;

public class Main {
	public static void main(String[] args) {
		CircularLinkedList circularLinkedList = new CircularLinkedList();

		System.out.println("Is the list empty? " + circularLinkedList.isEmpty());

		circularLinkedList.add(19);
		circularLinkedList.add(9);
		circularLinkedList.add(29);
		circularLinkedList.add(14);
		circularLinkedList.add(19);
		circularLinkedList.add(27);

		System.out.println("Is the list empty? " + circularLinkedList.isEmpty());

		circularLinkedList.display();

		System.out.println("Is 9 exist? " + circularLinkedList.isExist(9));

		circularLinkedList.insert(14, 1);
		circularLinkedList.display();

		circularLinkedList.remove(9);
		circularLinkedList.display();

		circularLinkedList.removeAtIndex(0);
		circularLinkedList.display();

		CircularLinkedListNode node = circularLinkedList.nodeAtIndex(1);
		if (node != null) {
			System.out.println("Node at index 1: " + node.data);
		}

		int size = circularLinkedList.size();
		System.out.println("Size of the list: " + size);
	}
}
