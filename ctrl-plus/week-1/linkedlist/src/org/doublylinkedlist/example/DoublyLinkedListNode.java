package org.doublylinkedlist.example;

public class DoublyLinkedListNode {
	public int data;
	public DoublyLinkedListNode prev;
	public DoublyLinkedListNode next;

	/**
	 * Constructs a new node with the given data.
	 *
	 * @param data the data to be stored in the node
	 */
	public DoublyLinkedListNode(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
