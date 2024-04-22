package newstart;

import java.util.Arrays;

public class Ocurrrr {
	public static void main(String[] args) {
		int[] a = { 1, 5, 2, 3, 5 };

		Arrays.sort(a);
		firstOcurr(a, 4);
		lastOcccur(a, 5);
	}

	private static int lastOcccur(int[] a, int taget) {

		int left = 0;
		int right = a.length - 1;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (a[mid] <= taget) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return right;

	}

	private static int firstOcurr(int[] a, int taget) {
		int left = 0;
		int right = a.length - 1;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (a[mid] >= taget) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;

	}
}
