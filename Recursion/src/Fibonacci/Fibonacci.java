package Fibonacci;

public class Fibonacci {

	int fibonacci(int n) {
		if (n == 0) {
			return n;
		} else {
			return (fibonacci(n - 1) + fibonacci(n - 2));
		}
	}
}
