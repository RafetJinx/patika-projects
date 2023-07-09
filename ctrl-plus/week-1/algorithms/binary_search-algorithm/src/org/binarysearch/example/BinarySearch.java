package org.binarysearch.example;

public class BinarySearch {
	public static boolean binarySearchIterative(int[] array, int valueSought) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (valueSought == array[mid]) {
				return true;
			} else if (valueSought < array[mid]) {
				right = mid - 1;
			} else if (valueSought > array[mid]) {
				left = mid + 1;
			}

		}

		return false;
	}

	public static boolean binarySearchRecursive(int[] array, int valueSought) {
		int left = 0;
		int right = array.length - 1;

		boolean result = binarySearchRecursive(array, valueSought, left, right);
		
		return result;
	}

	public static boolean binarySearchRecursive(int[] array, int valueSought, int left, int right) {
		if (left > right)
			return false;

		int mid = left + (right - left) / 2;

		if (valueSought == array[mid]) {
			return true;
		} else if (valueSought < array[mid]) {
			return binarySearchRecursive(array, valueSought, left, mid - 1);
		} else if (valueSought > array[mid]) {
			return binarySearchRecursive(array, valueSought, mid + 1, right);
		}
		return false;
	}
}
