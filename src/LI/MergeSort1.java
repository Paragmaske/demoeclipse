package LI;

import java.util.Arrays;

public class MergeSort1 {
	public static void main(String[] args) {
		int[] a = { 2, 12, 6, 76, 9 };
		int[] temp = new int[a.length];

		int[] mergeSort = mergeSortWithSpace(a);
		// mergeSortOptimised(a, 0, a.length - 1);

		for (int i : mergeSort) {
			System.out.print(i + " ");
		}
	}

	private static int[] mergeSortWithSpace(int[] a) {
		if (a.length == 1) {
			return a;
		}
		int mid = a.length / 2;
		int[] left = mergeSortWithSpace(Arrays.copyOfRange(a, 0, mid));
		int[] right = mergeSortWithSpace(Arrays.copyOfRange(a, mid, a.length));

		return merge(left, right);

	}

	private static int[] merge(int[] left, int[] right) {

		int leftp = 0;
		int rightp = 0;
		int ansp = 0;
		int[] ans = new int[left.length + right.length];

		while (leftp < left.length && rightp < right.length) {

			if (left[leftp] < right[rightp]) {
				ans[ansp] = left[leftp];
				leftp++;
				ansp++;
			} else {
				ans[ansp] = right[rightp];
				rightp++;
				ansp++;
			}
		}

		while (leftp < left.length) {
			ans[ansp] = left[leftp];
			leftp++;
			ansp++;
		}
		while (rightp < right.length) {
			ans[ansp] = right[rightp];
			rightp++;
			ansp++;
		}
		return ans;
	}

}
