
public class Fibonacci {
	static int fibonacci(int n) {
		int sum = 0;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		}
		if (n >= 3)

			sum = fibonacci(n - 1) + fibonacci(n - 2);
		return sum;
	}
}
