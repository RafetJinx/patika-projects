package org.circularlinkedlist.example;

public class CircularLinkedListNode {
	public int data;
	public CircularLinkedListNode next;

	/**
	 * Constructs a new node with the given data.
	 *
	 * @param data the data to be stored in the node
	 */
	public CircularLinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}
}
