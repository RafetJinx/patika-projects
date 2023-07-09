package org.quicksort.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	int[] arr = {24, 9, 29, 14, 19, 27};

        Quicksort.quicksort(arr);

        System.out.println(Arrays.toString(arr));
    }

}