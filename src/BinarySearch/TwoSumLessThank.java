package BinarySearch;

import java.util.Arrays;

public class TwoSumLessThank {
	public static void main(String[] args) {
		// Input: A = [34,23,1,24,75,33,54,8], K = 60

		int[] a = { 10, 20, 30 };
		int target = 15;
		find(a, target);
	}

	private static void find(int[] a, int target) {

		Arrays.sort(a);
		int ans = -1;
		int left = 0;
		int right = a.length - 1;

		while (left <= right) {
			if (a[left] + a[right] == target) {
				ans = target;
				System.exit(0);
			} else if (a[left] + a[right] > target) {
				right--;
			} else {
				ans = a[left] + a[right];
				left++;
			}
		}

		if (ans == target) {
			System.out.println(target);
		} else {
			System.out.println(ans);
		}
	}
}
