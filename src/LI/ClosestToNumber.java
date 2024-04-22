package LI;

public class ClosestToNumber {
	public static void main(String[] args) {

		int[] a = { 1, 12, 13, 18, 19, 20 };
		int number = 15;

		System.out.println(closestFloorNumber(15, a));

	}

	private static int closestFloorNumber(int target, int[] arr) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] > target) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}

		return arr[low];
	}
}
