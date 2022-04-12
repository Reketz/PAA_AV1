package paa;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] A = { 5, 6, 9, 7, 1, 8 };
		int[] orderA = insertionSort(A, A.length);
		System.out.println(Arrays.toString(orderA));

		/*
		 * Analise Insertion Sort
		 * 
		 * Pior caso
		 * 
		 * (n+1) (n+2) + 2n - 2 + 2n - 2 + 3n - 3 + 2n - 2 + 2n - 2 + 1 + 1 n² + 2n + n
		 * + 2 + 2n - 2 + 2n - 2 + 3n -3 + 2n - 2 + 2n - 2 + 1 + 1 n² + 14n - 7
		 * 
		 * n² + 14n - 7 <= c * n² - 7 n² + 14n <= c * n² n²/n + 14n/n <= (c * n²)/n n +
		 * 14 <= c * n 14 <= c * n - n 14 <= n(c - 1) 14 <= n(1) n = 14
		 * 
		 * --------------
		 * 
		 * n + 14 <= c * n 14 + 14 <= c * 14 c <= 28 / 14 c <= 2
		 * 
		 * Melhor caso
		 * 
		 * n² + 14n - 7 >= K * g(n) n² + 14n - 7 >= K * n - 7
		 * 
		 * n + 14 >= K * 1 14 >= K - n 14 => 1 - 1 14 => 0
		 * 
		 * K = 1 n = 1
		 * 
		 * Caso Medio
		 * 
		 * K * g(n) <= f(n) <= c * g(n) K * g(n) <= n² + 14n - 7 <= c * g(n)
		 * 
		 * K * n - 7 <= n² + 14n - 7 <= c * n² - 7 K * n <= n² + 14n <= c * n
		 * 
		 * (K * n)/n <= (n² + 14n)/n <= (c * n²)/n K <= n + 14 <= c * n K - n <= 14 <= c
		 * * n - n K - n <= 14 <= n(c - 1) 1 - 14 <= 14 <= 14(2 - 1) -13 <= 14 <= 14
		 * 
		 * K = 1 c = 2 n = 14
		 */
	}

	public static int[] insertionSort(int[] A, int n) {
		Integer pivo = null;
		for (int i = 1; i <= (n - 1); i++) {
			pivo = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > pivo) {
				A[j + 1] = A[j];
				j = j - 1;
			}
			A[j + 1] = pivo.intValue();
		}
		return A;
	}
}
