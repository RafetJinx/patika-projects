package org.quicksort.example;

public class Quicksort {
    public static void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    /**
     * Sorts the given array using the Quicksort algorithm.
     *
     * @param arr   The array to be sorted.
     * @param left  The leftmost index of the array or subarray to be sorted.
     * @param right The rightmost index of the array or subarray to be sorted.
     */
    public static void quicksort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = arr[left + (right - left) / 2];

        int[] indexes = partition(arr, left, right, pivot);
        int i = indexes[0];
        int j = indexes[1];

        // Sort the left subarray
        quicksort(arr, left, j);

        // Sort the right subarray
        quicksort(arr, i, right);
    }

    /**
     * Partitions the array around the pivot value.
     *
     * @param arr    The array to be partitioned.
     * @param left   The leftmost index of the partition range.
     * @param right  The rightmost index of the partition range.
     * @param pivot  The pivot value for partitioning.
     * @return An array containing the updated left and right indices of the partitioned subarray.
     */
    public static int[] partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            // Move the left pointer until finding an element greater than or equal to the pivot
            while (arr[left] < pivot) {
                left++;
            }

            // Move the right pointer until finding an element smaller than or equal to the pivot
            while (arr[right] > pivot) {
                right--;
            }

            // Swap the elements if left pointer is still less than or equal to right pointer
            if (left <= right) {
                swap(arr, left, right);

                left++;
                right--;
            }
        }

        int[] leftRightValue = { left, right };

        return leftRightValue;
    }

    /**
     * Swaps two elements in the array.
     *
     * @param arr The array.
     * @param i   The index of the first element.
     * @param j   The index of the second element.
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
