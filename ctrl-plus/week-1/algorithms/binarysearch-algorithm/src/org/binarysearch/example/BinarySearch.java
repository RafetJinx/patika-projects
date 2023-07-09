package org.binarysearch.example;

public class BinarySearch {
	/**
     	* Performs iterative binary search on a sorted array to find a specific value.
     	*
     	* @param array      the sorted array to be searched
     	* @param valueSought the value to be searched for
     	* @return true if the value is found, false otherwise
     	*/
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

	/**
     	* Performs recursive binary search on a sorted array to find a specific value.
     	*
     	* @param array      the sorted array to be searched
     	* @param valueSought the value to be searched for
     	* @return true if the value is found, false otherwise
     	*/
	public static boolean binarySearchRecursive(int[] array, int valueSought) {
		int left = 0;
		int right = array.length - 1;

		boolean result = binarySearchRecursive(array, valueSought, left, right);
		
		return result;
	}

	/**
     	* Recursive helper function for binary search.
     	*
     	* @param array      the sorted array to be searched
     	* @param valueSought the value to be searched for
     	* @param left       the left index of the search range
     	* @param right      the right index of the search range
     	* @return true if the value is found, false otherwise
     	*/
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
