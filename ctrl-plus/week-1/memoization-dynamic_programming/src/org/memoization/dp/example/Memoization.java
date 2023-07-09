package org.memoization.dp.example;

import java.util.HashMap;
import java.util.Map;

public class Memoization {
	private static Map<Integer, Integer> memo = new HashMap<>();

	/**
     * Calculates the Fibonacci number at the desired position using memoization.
     *
     * @param desiredValue The position of the Fibonacci number to calculate.
     * @return The Fibonacci number at the desired position.
     */
	public static int fibonacci(int desiredValue) {
		// Check if the result for the desired value is already stored in the memo
		if (memo.containsKey(desiredValue)) {
			return memo.get(desiredValue);
		}

		int result = 0;

		// Check for negative input
		if (desiredValue < 0) {
			return -1;
		}

		// Base cases: 1 or 2
		if (desiredValue <= 2) {
			return 1;
		} else {
			// Recursive calculation for larger values
			result = fibonacci(desiredValue - 1) + fibonacci(desiredValue - 2);
		}
		
		memo.put(desiredValue, result);

		return result;
	}
}
