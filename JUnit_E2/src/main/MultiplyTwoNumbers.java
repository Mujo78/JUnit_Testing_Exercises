package main;

public class MultiplyTwoNumbers {

	public static double multiplyTwoNumbers(double a, double b) {
		double c = a * b;
		if (c > 100) {
			throw new IllegalArgumentException("Larger than 100!");
		} else {
			return c;
		}

	}
}
