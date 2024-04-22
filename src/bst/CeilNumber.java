package bst;

import java.util.Arrays;

public class CeilNumber {
	public static void main(String[] args) {

		int[] a = {4,2,3,4};
//
		Arrays.parallelSort(a);
		int count = 0;
		int leftf = 0;
		
		int right = a.length - 1;
		while (leftf <= a.length - 2) {
			int lefts = leftf + 1;
			while (lefts < right) {
				if (a[right] + a[lefts] > a[leftf]) {
					count=count+right-lefts;
					right--;
				} else {
					lefts++;
				}

			}
			leftf++;
		}
		System.out.println(count);
	}

	private static boolean findceil(int[] a, int ele) {
		int left = -1;
		int right = a.length;

		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (a[mid] <= ele) {
				left = mid;
			} else {
				right = mid;
			}
		}
		if (right == a.length) {
			return false;
		}
		return true;

	}
//2 2 3 4 

	private static boolean findValid(int[] a, int ele) {
		int left = -1;
		int right = a.length;

		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (a[mid] < ele) {
				left = mid;
			} else {
				right = mid;
			}
		}

		if (left == a.length) {
			return false;
		}
		return true;

	}

	public int triangleNumber(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		for (int i = nums.length - 1; i >= 0; i--) // pair sum -- s1+s2>s3
		{
			int l = 0;
			int r = i - 1;
			while (l < r) {
				int sum = nums[l] + nums[r];
				if (sum > nums[i]) {
					count = count + (r - l);
					r--;
				} else {
					l++;
				}
			}
		}
		return count;
	}
}
