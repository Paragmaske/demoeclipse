package BinarySearch;

public class PaintersPartitionAdv {
	public static void main(String[] args) {
		int[] array = { 1, 8, 11, 3 };
		int painters = 10;
		int speed = 1;
		solve(array, painters, speed);
	}

	private static int solve(int[] array, int painters, int speed) {
		int maxValue = Integer.MIN_VALUE;
		int sum = 0;
		for (int i : array) {
			sum = sum + i;
			if (i > maxValue) {
				maxValue = Math.max(maxValue, i);
			}
		}

		int left = maxValue;
		int right = sum;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (pred(array, mid) <= painters) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return (left * speed);
	}

	private static int pred(int[] array, int mid) {
		int continous = 1;
		int sum = 0;
		for (int i : array) {
			sum = sum + i;
			if (mid > sum) {
				continous++;
				sum = i;
			} else {

			}
		}
		return continous;
	}
}
