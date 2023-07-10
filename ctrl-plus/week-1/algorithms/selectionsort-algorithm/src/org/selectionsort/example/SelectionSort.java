package org.selectionsort.example;

public class SelectionSort {
	/**
     * Sorts an array of integers using the selection sort algorithm.
     *
     * @param arr the array to be sorted
     */
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				swap(arr, minIndex, i);
			}
		}
	}

	/**
     * Swaps two elements in the given array.
     *
     * @param arr the array in which the elements should be swapped
     * @param i   the index of the first element
     * @param j   the index of the second element
     */
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
