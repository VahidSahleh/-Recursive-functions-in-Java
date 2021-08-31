import java.util.*;
import java.lang.Math;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

public class Matrix {
	public static int i = 0, j = 0, k = 0;
	//To calculate the Multiplication of two matrices
	public void matrix(float[][] A, float[][] B, float[][] C, float n) {

		if (i >= n) {

			return;

		}
		if (j < n) {
			if (k < n) {
				C[i][j] += A[i][k] * B[k][j];
				k++;
				matrix(A, B, C, n);
			}
			k = 0;
			j++;
			matrix(A, B, C, n);
		}
		j = 0;
		i++;
		matrix(A, B, C, n);

	}
	//save the final Matrix into a new Matrix and return it for using it in ShowMatrix method
	public float[][] Mmatrix(float[][] A, float[][] B, int n) {
		float[][] C = new float[n][n];
		matrix(A, B, C, n);
		float[][] K = C;
		return K;

	}
	//for showing the final Matrix 
	public static void ShowMatrix(float[][] k, int i, int j) {

		//if matrix is empty return null
		if (k == null) {
			return;
		}
		//if i is equal to arrays first dimension length return null
		if (i == k.length) {
			return;
			//if i is equal to arrays second dimension length return null
		} else if (j == k.length) {
			return;
		}
		
		System.out.print(k[i][j] + " ");
		//if second dimension length-1 is equal to j
		if (j == k.length - 1) {
			System.out.println();
			ShowMatrix(k, i + 1, 0);
		}

		ShowMatrix(k, i, j + 1);
	}
}
