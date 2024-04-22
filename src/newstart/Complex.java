package newstart;

import java.util.PriorityQueue;

public class Complex {
	public static void main(String[] args) {
		int[][] a = { {1,2},{1,3} };
		int k = 1;
		// System.out.println(findk(a, k));
		System.out.println(findUsing2d(a, k));

	}

	private static int findUsing2d(int[][] a, int k) {

		int left = 0;
		int right = (a[0].length * a.length) - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (mid == (k - 1)) {
				return a[mid / a[0].length][mid % a[0].length];
			} else if (a[mid / a[0].length][mid % a[0].length] > (k - 1)) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	private static int findk(int[][] a, int k) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				p.add(a[i][j]);
			}
		}

		int count = 1;
		int ans = 0;
		while (count <= k) {
			ans = p.poll();
			count++;
		}
		return ans;
	}
}
