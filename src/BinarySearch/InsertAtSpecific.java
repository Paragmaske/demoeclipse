package BinarySearch;

public class InsertAtSpecific {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5 };
		insertFun(a, 6);
	}

	private static void insertFun(int[] a, int target) {
		int left = 0;
		int right = a.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (a[mid] == target) {
				System.out.println(mid);
				System.exit(0);
			} else if (a[mid] < target) {
				left = mid + 1;

			} else {
				right = mid - 1;
			}
		}

		System.out.println(left);
	}
}
