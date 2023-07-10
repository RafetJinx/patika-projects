package org.selectionsort.example;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = {64, 25, 12, 22, 11};
		
		System.out.println("Unsorted Array: " + Arrays.toString(arr));
		
		SelectionSort.selectionSort(arr);
		
		System.out.println("Unsorted Array: " + Arrays.toString(arr));
	}
}
