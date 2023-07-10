package org.singlylinkedlist.example;

import org.indexoutofbounds.example.IndexOutOfBounds;

public class SinglyLinkedList {
	private SinglyLinkedListNode head;

	/**
	 * Checks if the linked list is empty.
	 *
	 * @return true if the linked list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * Adds a new node with the given data at the end of the linked list.
	 *
	 * @param data the data to be added
	 */
	public void add(int data) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

		if (head == null) {
			head = newNode;
		} else {
			SinglyLinkedListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	/**
	 * Searches for the first occurrence of the given data in the linked list.
	 *
	 * @param data the data to search for
	 * @return true if the data is found, false otherwise
	 */
	public boolean isExist(int data) {
		SinglyLinkedListNode current = head;

		while (current != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	/**
	 * Inserts a new node with the given data at the specified index in the linked
	 * list.
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

		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

		if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			SinglyLinkedListNode current = head;

			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	/**
	 * Removes the first occurrence of the given data from the linked list.
	 *
	 * @param data the data to be removed
	 * @return true if the data is found and removed, false otherwise
	 */
	public boolean remove(int data) {
		if (head == null) {
			return false;
		}

		if (head.data == data) {
			head = head.next;
			return true;
		}

		SinglyLinkedListNode current = head;
		while (current != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	/**
	 * Removes the node at the specified index from the linked list.
	 *
	 * @param index the index of the node to be removed
	 * @return true if the index is valid and the node is removed, false otherwise
	 */
	public boolean removeAtIndex(int index) {
		if (index < 0) {
			return false;
		}

		if (index >= size()) {
			return false;
		}

		if (index == 0) {
			head = head.next;
			return true;
		}

		SinglyLinkedListNode current = head;

		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}

		current.next = current.next.next;
		return true;
	}

	/**
	 * Returns the node at the specified index in the linked list.
	 *
	 * @param index the index of the node to be returned
	 * @return the node at the specified index, or null if the index is invalid
	 */
	public SinglyLinkedListNode nodeAtIndex(int index) {
		if (index < 0) {
			IndexOutOfBounds.indexLessThenZero();
		}

		if (index > size()) {
			IndexOutOfBounds.indexGreaterThenSize();
		}

		SinglyLinkedListNode current = head;

		for (int i = 0; i < index; i++) {
			current = current.next;
		}

		return current;
	}

	/**
	 * Returns the size (number of nodes) of the linked list.
	 *
	 * @return the size of the linked list
	 */
	public int size() {
		int count = 0;
		SinglyLinkedListNode current = head;

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
		SinglyLinkedListNode current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

}
