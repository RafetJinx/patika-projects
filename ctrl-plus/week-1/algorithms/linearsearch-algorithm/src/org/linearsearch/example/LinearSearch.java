package org.linearsearch.example;

public class LinearSearch {
	/**
     * Performs a linear search on the given array to find the specified key.
     *
     * @param array the array to be searched
     * @param key   the value to be found in the array
     * @return the index of the key if found, -1 otherwise
     */
	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	/**
     * Performs a linear search on the given array to find the specified value.
     * Prints the search value and its index if found, or a message if not found.
     *
     * @param array         the array to be searched
     * @param searchValue   the value to be found in the array
     */
	public static void printSearchResult(int[] array, int searchValue) {
		int index = linearSearch(array, searchValue);

		if (index == -1) {
			System.out.println("Search value cannot be found in the array.");
		} else {
			System.out.println("Search value: " + searchValue);
			System.out.println("Index: " + index);
		}
	}
}
