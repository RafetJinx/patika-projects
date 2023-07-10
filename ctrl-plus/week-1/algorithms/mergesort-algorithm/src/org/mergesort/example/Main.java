package org.mergesort.example;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 24, 9, 29, 14, 19, 27 };
		System.out.println("Original array: " + Arrays.toString(arr));

		MergeSort.mergeSort(arr);

		System.out.println("Sorted array: " + Arrays.toString(arr));
	}
}
