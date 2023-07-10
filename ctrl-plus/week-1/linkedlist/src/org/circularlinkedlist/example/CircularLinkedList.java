package org.circularlinkedlist.example;

import org.indexoutofbounds.example.IndexOutOfBounds;

public class CircularLinkedList {
	private CircularLinkedListNode head;

	/**
	 * Checks if the circular linked list is empty.
	 *
	 * @return true if the circular linked list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * Adds a new node with the given data at the end of the circular linked list.
	 *
	 * @param data the data to be added
	 */
	public void add(int data) {
		CircularLinkedListNode newNode = new CircularLinkedListNode(data);
		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			CircularLinkedListNode current = head;
			while (current.next != head) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = head;
		}
	}

	/**
	 * Checks if a node with the given data exists in the circular linked list.
	 *
	 * @param data the data to search for
	 * @return true if the node with the data exists, false otherwise
	 */
	public boolean isExist(int data) {
		if (head == null) {
			return false;
		}

		CircularLinkedListNode current = head;
		do {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		} while (current != head);

		return false;
	}

	/**
	 * Inserts a new node with the given data at the specified index in the circular
	 * linked list.
	 *
	 * @param data  the data to be inserted
	 * @param index the index at which the data should be inserted
	 * @throws IndexOutOfBoundsException if the index is invalid (less than 0 or
	 *                                   greater than the size of the list)
	 */
	public void insert(int data, int index) {
		if (index < 0) {
			IndexOutOfBounds.indexLessThenZero();
		}

		if (index > size()) {
			IndexOutOfBounds.indexGreaterThenSize();
		}

		CircularLinkedListNode newNode = new CircularLinkedListNode(data);

		if (index == 0) {
			if (head == null) {
				head = newNode;
				newNode.next = head;
			} else {
				CircularLinkedListNode current = head;
				while (current.next != head) {
					current = current.next;
				}
				newNode.next = head;
				current.next = newNode;
				head = newNode;
			}
		} else {
			CircularLinkedListNode current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	/**
	 * Removes the first occurrence of the node with the given data from the
	 * circular linked list.
	 *
	 * @param data the data to be removed
	 * @return true if the node with the data is found and removed, false otherwise
	 */
	public boolean remove(int data) {
		if (head == null) {
			return false;
		}

		if (head.data == data) {
			if (head.next == head) {
				head = null;
			} else {
				CircularLinkedListNode current = head;
				while (current.next != head) {
					current = current.next;
				}
				current.next = head.next;
				head = head.next;
			}
			return true;
		}

		CircularLinkedListNode current = head;
		while (current.next != head) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}

		return false;
	}

	/**
	 * Removes the node at the specified index from the circular linked list.
	 *
	 * @param index the index of the node to be removed
	 * @return true if the index is valid and the node is removed, false otherwise
	 */
	public boolean removeAtIndex(int index) {
		if (index < 0) {
			IndexOutOfBounds.indexLessThenZero();
		}

		if (index > size()) {
			IndexOutOfBounds.indexGreaterThenSize();
		}

		if (index == 0) {
			if (head.next == head) {
				head = null;
			} else {
				CircularLinkedListNode current = head;
				while (current.next != head) {
					current = current.next;
				}
				current.next = head.next;
				head = head.next;
			}
			return true;
		}

		CircularLinkedListNode current = head;
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		current.next = current.next.next;
		return true;
	}

	/**
	 * Returns the node at the specified index in the circular linked list.
	 *
	 * @param index the index of the node to be returned
	 * @return the node at the specified index, or null if the index is invalid
	 */
	public CircularLinkedListNode nodeAtIndex(int index) {
		if (index < 0) {
			IndexOutOfBounds.indexLessThenZero();
		}

		if (index > size()) {
			IndexOutOfBounds.indexGreaterThenSize();
		}

		CircularLinkedListNode current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}

	/**
	 * Returns the size (number of nodes) of the circular linked list.
	 *
	 * @return the size of the circular linked list
	 */
	public int size() {
		if (head == null) {
			return 0;
		}

		int count = 0;
		CircularLinkedListNode current = head;
		do {
			count++;
			current = current.next;
		} while (current != head);

		return count;
	}

	/**
	 * Displays the elements of the circular linked list.
	 */
	public void display() {
		if (head == null) {
			System.out.println("Circular linked list is empty");
		} else {
			CircularLinkedListNode current = head;
			do {
				System.out.print(current.data + " ");
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}
}
