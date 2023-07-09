package org.memoization.dp.example;

public class Main {
	public static void main(String[] args) {
		int desiredValue = 12;
		
		int result = Memoization.fibonacci(desiredValue);
		
		if(result == -1) {
			System.out.println("The given value must be greater than 0! (Given value is : " + desiredValue + ")");
		} else {
			System.out.println("Desired Value(" + desiredValue + ") and the result is : " + result);
		}
	}
}
