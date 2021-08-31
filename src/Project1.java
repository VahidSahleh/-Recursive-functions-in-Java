import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.println("1-Fibonacci  2-Donbale hendesi va hesabi  3-Matrix");
		System.out.println("Enter number:");
		int b = input1.nextInt();
		if (b == 1) {
			Fibonacci a = new Fibonacci();
			System.out.println("Enter number:");
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			System.out.print(a.fibonacci(n));
		} else if (b == 2) {
			Scanner input = new Scanner(System.in);
			System.out.println("Avalin jomle:");
			int a = input.nextInt();
			System.out.println("ghadre nesbat:");
			int r = input.nextInt();
			System.out.println("n:");
			int n = input.nextInt();

			H h = new H();
			h.hendesi(a, r, n);
			h.hesabi(a, r, n);
			System.out.print("Hesabi: " + h.hesabi(a, r, n) + "    Hendesi: " + h.hendesi(a, r, n));

		} else if (b == 3) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter n*n:");
			int n = input.nextInt();
			System.out.println("Enter Matrix A:");
			float[][] A = new float[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					A[i][j] = input.nextFloat();

				}
			}
			System.out.println("Enter Matrix B:");
			float[][] B = new float[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					B[i][j] = input.nextFloat();

				}
			}
			Matrix m = new Matrix();
			Matrix m1 = new Matrix();
			float[][] K =m.Mmatrix(A, B, n);
			m1.ShowMatrix(K, 0, 0);
		}

	}

}
