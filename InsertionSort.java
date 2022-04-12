package paa;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] A = { 5, 6, 9, 7, 1, 8 };
		int[] orderA = insertionSort(A, A.length);	
		System.out.println(Arrays.toString(orderA));	
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
