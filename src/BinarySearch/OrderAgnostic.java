package BinarySearch;

public class OrderAgnostic {
	public static void main(String[] args) {

		int[] a = { 500,50, 40, 30, 20 };
		int[] b = { 10, 20, 30, 40, 50 };

		searchBinary(a, 500);
	}

	private static boolean searchBinary(int[] a, int target) {

		int left = 0;
		int right = a.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (a[mid] == target) {
				System.out.println(mid);
				return true;
			} else if (a[mid] > target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		return false;
	}
}
