package BinarySearch;

public class PaintersPartition {
	public static void main(String[] args) {
		int arr[] = {1,10,3,10,2};
		int k = 3;

		int left = 40;
		int right = 100;
		int optimised = 0;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (pred(mid, arr) == k) {
				optimised = mid;
				right = mid - 1;
			} else if (pred(mid, arr) < k) {
				right = mid - 1;
			} else {
				left = left + 1;

			}
		}
		System.out.println(optimised);
	}

	private static int pred(int mid, int[] arr) {
		int subASize = 1;
		int sum = 0;
		for (int i : arr) {
			sum += i;
			if (sum > mid) {
				subASize++;
				sum=i;
			}
		}
		return subASize;
	}

}
