package BinarySearch;

public class KokoBanana {

	public static void main(String[] args) {
		int[] a = { 3, 6, 7, 11 };
		int h = 8;
		System.out.println(koko(a, h));
	}

	private static int koko(int[] a, int h) {

		int left = 1;
		int right = 0;
		for (int i = 0; i < a.length; i++) {
			right = Math.max(a[i], right);
		}

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (pred(mid, h, a) == 0) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return left;
	}

	private static int pred(int mid, int h, int[] a) {
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % mid == 0) {
				sum = sum + a[i] / mid;
			} else {
				sum = sum + a[i] / mid + 1;
			}
		}
		if (sum <= h) {
			return 0;
		}
		return 1;

	}

}
