import java.lang.Math;

public class H {
	static int hendesi(int a, int r, int n) {
		int h1 = 0;

		if (n == 1) {
			return a;
		}
		if (n >= 2)
			h1 = (int) (a * (Math.pow(r, n - 1)));

		return h1;

	}

	static int hesabi(int a, int r, int n) {

		int h2 = 0;
		if (n == 1) {
			return a;
		}
		if (n >= 2)

			h2 = a + r * (n - 1);

		return h2;

	}
}
