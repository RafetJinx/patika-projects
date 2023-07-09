package ogr.bubblesort.example;

public class BubbleSort {
	/**
	 * Sorts an array of integers in ascending order using the bubble sort
	 * algorithm.
	 *
	 * @param arr the array of integers to be sorted
	 */
	public static void bubblesort(int[] arr) {
		boolean isSorted = false;
		int lastUnsorted = arr.length - 1;

		/* Continue until the array is sorted */
		while (!isSorted) {
			isSorted = true;

			/*
			 * This code sorts the array by repeatedly comparing adjacent elements and
			 * swapping them if they are in the wrong order.
			 */
			for (int i = 0; i < lastUnsorted; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
					isSorted = false;
				}
			}
			lastUnsorted--;
		}
	}

	/**
	 * Swaps two elements in an array.
	 *
	 * @param arr the array containing the elements
	 * @param i   the index of the first element
	 * @param j   the index of the second element
	 */
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
