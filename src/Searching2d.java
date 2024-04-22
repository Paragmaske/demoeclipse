
public class Searching2d {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 7, 9, 10 };

		int[][] in = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		search(in, 3);

	}

	private static boolean search(int[][] a, int target) {
		if (a[0].length == 1 && a.length == 1 && target == a[0][0]) {
			System.out.println();
		}
		int left = 0;
		int right = a[0].length * a.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (a[mid / a[0].length][mid % a[0].length] > target) {
				right = mid - 1;
			} else if (a[mid / a[0].length][mid % a[0].length] < target) {
				left = mid + 1;
			} else {
				return true;
			}
		}

		return false;
	}
}
