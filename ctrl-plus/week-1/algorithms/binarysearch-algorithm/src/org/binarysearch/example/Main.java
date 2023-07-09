package org.binarysearch.example;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 19, 9, 24, 14, 19, 27 };

		Arrays.sort(arr);

		boolean isValueExistRecursive = BinarySearch.binarySearchRecursive(arr, 12);
		boolean isValueExistIterative = BinarySearch.binarySearchIterative(arr, 19);

		System.out.println(isValueExistRecursive);
		System.out.println(isValueExistIterative);
	}
}
