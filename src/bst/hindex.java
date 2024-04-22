package bst;

public class hindex {
	public static void main(String[] args) {

		int[] a = {1};

		System.out.println(hIndex(a));

	}

	public static int hIndex(int[] a) {
		int left = 0;
		int right = a.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (a[mid] == a.length - mid) {
				return a.length - mid;
			} else if (a[mid] > a.length - mid) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}
		return a.length-left;

	}

}
