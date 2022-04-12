package paa;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] A = { 5, 6, 9, 7, 1, 8 };
		int[] orderA = selectionSorte(A, A.length);
		System.out.println(Arrays.toString(orderA));
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