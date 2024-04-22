package BinarySearch;

public class MininmumNumberToMakeMBoquets {
	public static void main(String[] args) {
		int[] bloomDay = {1,10,3,10,2};
		int subArrayLength = 3;
		int noOfSubArray = 1;

		 System.out.println(minDays(bloomDay, subArrayLength, noOfSubArray));

	}

	public static int minDays(int[] bloomDay, int subArrayLength, int noOfSubArray) {

		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;

		for (int i : bloomDay) {
			if (i < minValue) {
				minValue = Math.min(minValue, i);
			}
			if (i > maxValue) {
				maxValue = Math.max(maxValue, i);
			}
		}

		int left = minValue;
		int right = maxValue;

		int ans = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (pred(bloomDay, mid, subArrayLength, noOfSubArray) >= noOfSubArray) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ans;

	}

	private static int pred(int[] bloomDay, int mid, int subArrayLength, int noOfSubArray) {
		// 7,7,7,7,12,7,7
		int subArrays = 0;
		int adjacentElement = 0;
		for (int i : bloomDay) {

			if (i <= mid) {
				adjacentElement++;
			}
			else 
			{
				adjacentElement=0;
			}
			if (adjacentElement == subArrayLength) {
				subArrays++;
				adjacentElement=0;
			}

		}
		return subArrays;
	}
}
