package BinarySearch;


public class SplitArrayLargestSum {
	public static void main(String[] args) {
		int[] a = { 1,4,4};
		int k = 3;

		System.out.println(splitArray(a, k));
	}

	private static int splitArray(int[] a, int k) {

		int maxSubArraySum = 0;
		int maxSum=0;
		for (int i : a) {
			maxSum=Math.max(maxSum, i);
			maxSubArraySum += i;
		}

		int left = maxSum;
		int right = maxSubArraySum;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (pred(mid, k, a) <=k) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}

		return left;
	}

	private static int pred(int mid, int k, int[] a) {
		int subArrayCount = 1;
		int sum = 0;
		for (int i : a) {
			sum = sum + i;
			if (sum > mid) {
				subArrayCount++;
				sum = i;
			}
		}

		return (subArrayCount);
	}
}
