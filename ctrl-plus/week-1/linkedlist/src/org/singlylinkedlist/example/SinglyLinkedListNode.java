package org.singlylinkedlist.example;

public class SinglyLinkedListNode {
	public int data;
	public SinglyLinkedListNode next;

	/**
	 * Constructs a new node with the given data.
	 *
	 * @param data the data to be stored in the node
	 */
	public SinglyLinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}
}
