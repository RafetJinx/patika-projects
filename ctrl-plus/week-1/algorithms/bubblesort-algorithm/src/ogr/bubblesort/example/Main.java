package ogr.bubblesort.example;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 24, 9, 29, 14, 19, 27 };

		System.out.println("Before Bubble Sort: " + Arrays.toString(arr));

		BubbleSort.bubblesort(arr);

		System.out.println("After Bubble Sort: " + Arrays.toString(arr));
	}
}
