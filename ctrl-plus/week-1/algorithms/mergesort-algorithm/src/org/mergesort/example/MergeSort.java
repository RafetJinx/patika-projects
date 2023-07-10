package org.mergesort.example;

public class MergeSort {
	/**
	 * Sorts an array of integers using the merge sort algorithm.
	 *
	 * @param arr the array to be sorted
	 */
	public static void mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return;
		}

		int mid = (int) arr.length / 2;

		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];

		// Split the array into two halves
		System.arraycopy(arr, 0, left, 0, left.length);
		System.arraycopy(arr, mid, right, 0, right.length);

		mergeSort(left);
		mergeSort(right);

		merge(arr, left, right);
	}

	/**
	 * Merges two sorted subarrays into a single sorted array.
	 *
	 * @param arr   the original array to store the merged result
	 * @param left  the left subarray
	 * @param right the right subarray
	 */
	private static void merge(int[] arr, int[] left, int[] right) {
		int arrIndex = 0;
		int leftIndex = 0;
		int rightIndex = 0;

		// Merge elements from left and right subarrays into the original array
		while (leftIndex < left.length && rightIndex < right.length) {
			if (left[leftIndex] <= right[rightIndex]) {
				arr[arrIndex] = left[leftIndex];
				leftIndex++;
			} else {
				arr[arrIndex] = right[rightIndex];
				rightIndex++;
			}
			arrIndex++;
		}

		// Copy remaining elements from the left subarray, if any
		while (leftIndex < left.length) {
			arr[arrIndex] = left[leftIndex];
			leftIndex++;
		}

		// Copy remaining elements from the right subarray, if any
		while (rightIndex < right.length) {
			arr[arrIndex] = right[rightIndex];
			rightIndex++;
		}
	}
}
