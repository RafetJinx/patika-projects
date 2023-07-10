package org.doublylinkedlist.example;

import org.indexoutofbounds.example.IndexOutOfBounds;

public class DoublyLinkedList {
	private DoublyLinkedListNode head;

	/**
	 * Checks if the doubly linked list is empty.
	 *
	 * @return true if the doubly linked list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * Adds a new node with the given data at the end of the doubly linked list.
	 *
	 * @param data the data to be added
	 */
	public void add(int data) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
		if (head == null) {
			head = newNode;
		} else {
			DoublyLinkedListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			newNode.prev = current;
			current.next = newNode;
		}
	}

	/**
	 * Checks if a node with the given data exists in the doubly linked list.
	 *
	 * @param data the data to search for
	 * @return true if the node with the data exists, false otherwise
	 */
	public boolean isExist(int data) {
		DoublyLinkedListNode current = head;
		while (current != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	/**
	 * Inserts a new node with the given data at the specified index in the doubly
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

		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

		if (index == 0) {
			newNode.next = head;
			if (head != null) {
				head.prev = newNode;
			}
			head = newNode;
		} else {
			DoublyLinkedListNode current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			newNode.prev = current;
			newNode.next = current.next;
			if (current.next != null) {
				current.next.prev = newNode;
			}
			current.next = newNode;
		}
	}

	/**
	 * Removes the first occurrence of the node with the given data from the doubly
	 * linked list.
	 *
	 * @param data the data to be removed
	 * @return true if the node with the data is found and removed, false otherwise
	 */
	public boolean remove(int data) {
		DoublyLinkedListNode current = head;
		while (current != null) {
			if (current.data == data) {
				if (current.prev != null) {
					current.prev.next = current.next;
				} else {
					head = current.next;
				}
				if (current.next != null) {
					current.next.prev = current.prev;
				}
				return true;
			}
			current = current.next;
		}
		return false;
	}

	/**
	 * Removes the node at the specified index from the doubly linked list.
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
			head = head.next;
			if (head != null) {
				head.prev = null;
			}
			return true;
		}

		DoublyLinkedListNode current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}

		current.prev.next = current.next;
		if (current.next != null) {
			current.next.prev = current.prev;
		}
		return true;
	}

	/**
	 * Returns the node at the specified index in the doubly linked list.
	 *
	 * @param index the index of the node to be returned
	 * @return the node at the specified index, or null if the index is invalid
	 */
	public DoublyLinkedListNode nodeAtIndex(int index) {
		if (index < 0) {
			IndexOutOfBounds.indexLessThenZero();
		}

		if (index > size()) {
			IndexOutOfBounds.indexGreaterThenSize();
		}

		DoublyLinkedListNode current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}

	/**
	 * Returns the size (number of nodes) of the doubly linked list.
	 *
	 * @return the size of the doubly linked list
	 */
	public int size() {
		int count = 0;
		DoublyLinkedListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	/**
	 * Displays the elements of the linked list.
	 */
	public void display() {
		DoublyLinkedListNode current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}
