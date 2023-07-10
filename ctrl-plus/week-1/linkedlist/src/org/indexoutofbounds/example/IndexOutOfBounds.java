package org.indexoutofbounds.example;

public class IndexOutOfBounds {
	public static void indexLessThenZero() {
		throw new IndexOutOfBoundsException("Index cannot be less than 0!");
	}

	public static void indexGreaterThenSize() {
		throw new IndexOutOfBoundsException("Index cannot be greater than the size of the list!");
	}
}
