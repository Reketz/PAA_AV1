package paa;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] A = { 5, 6, 9, 7, 1, 8 };
		int[] orderA = selectionSorte(A, A.length);
		System.out.println(Arrays.toString(orderA));
		/*
		 * Analise Selection Sort
		 * 
		 * (n + 2) * 2n + n - 1 + 2n + 2 * (n + 2) + n + 2 + n + 2 + n + 2 + 1 2n² + 4n
		 * + n - 1 + 2n + 2n + 4 + n + 2 + n + 2 + n + 2 + 1
		 * 
		 * f(n) = 2n² + 12n + 10
		 * 
		 * Pior caso
		 * 
		 * 2n² + 12n + 10 <= c * n² + 10 (corta os 10) 2n² + 12n <= c * n² 2n²/n + 12n/n
		 * <= c * n²/n
		 * 
		 * 2n + 12 <= c * n
		 * 
		 * 12 <= c * n - 2n 12 <= n (c - 2) 12 <= n2 12/2 <= n
		 * 
		 * n = 6
		 * 
		 * --------------
		 * 
		 * 2n + 12 <= c * n 2 * 6 + 12 <= c * 12 24 <= c * 12 c <= 24 / 12 c <= 2
		 * 
		 * Melhor caso
		 * 
		 * 2n² + 12n + 10 >= K * g(n) 2n² + 12n + 10 >= K * n + 10
		 * 
		 * 2n² + 12n >= K * n 2n²/n + 12n/n >= (K * n)/n 2n + 12 >= K * 1 12 => K * 2n K
		 * => 12 / 2 K => 6
		 * 
		 * n = 1 K = 6
		 * 
		 * Caso Medio
		 * 
		 * K * g(n) <= 2n² + 12n + 10 <= c * g(n) K * n + 10 <= 2n² + 12n + 10 <= c * n²
		 * + 10
		 * 
		 * K * n <= 2n² + 12n <= c * n² (K * n)/n <= (2n² + 12n)/n <= (c * n²)/n
		 * 
		 * K <= 2n + 12 <= c * n - n K - 2n <= 12 <= n(c - 1) 6 - (2 * 6) <= 12 <=
		 * 12(2-1) -6 <= 12 <= 12
		 * 
		 * K = 6 c = 2 n = 12
		 */
	}

	public static int[] selectionSorte(int[] A, int n) {
		for (int i = 0; i <= (n - 1); i++) {
			int i_min = i;
			for (int j = i + 1; j <= (n - 1); j++) {
				if (A[j] < A[i_min]) {
					i_min = j;
				}
			}
			if (A[i] != A[i_min]) {
				int temp = A[i];
				A[i] = A[i_min];
				A[i_min] = temp;
			}
		}
		return A;
	}
}