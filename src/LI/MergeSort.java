package LI;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] a = { 3,11,14,5 };
		mergeSort(a, 0, a.length-1);
		for (int i : a) {
			System.out.print(i + "  ");
		}
	}

	private static void mergeSort(int[] a, int start, int end) {
		if (end-start == 1) {
			return;
		}
		int mid = start + end / 2;
		mergeSort(a, start, mid);
		mergeSort(a, mid, end);

		merge(a, start, mid, mid, end);

	}

	private static void merge(int[] a, int start1, int end1, int start2, int end2) {
		int leftp = 0;
		int rightp = 0;
		int finalp = 0;
		int minlen = Math.min(end2 - start2, end1 - start1);

		for (int i = 0; i < minlen; i++) {

			if (a[start1] > a[start2]) {
				a[finalp] = a[start2];
				rightp++;
				finalp++;
			} else {
				a[finalp] = a[start1];
				leftp++;
				finalp++;
			}
		}

		for (int i = leftp; i < end1 - start1; i++) {
			a[finalp] = a[i];
			finalp++;
		}
		for (int i = rightp; i < end2 - start2; i++) {
			a[finalp] = a[i];
			finalp++;

		}

	}
}
