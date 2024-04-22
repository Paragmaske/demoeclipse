package BinarySearch;

public class MountainArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 5, 3, 1 };
		int target = 3;

		int mountainFirst = mountainFirst(array, 3);
		int elementIndex = elementIndex(array, 0, mountainFirst, target);
		int elementIndex2 = elementIndex(array, mountainFirst+1, array.length-1, target);


	}
	


	private static int elementIndex(int[] a, int left, int right, int elementTofind) {
		boolean flag = false;
		if (a[left] > a[right]) {
			flag = false;
		} else {
			flag = true;
		}
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (a[mid] == elementTofind) {
				return mid;
			} else if (a[mid] > elementTofind) {
				if (flag)
					right = mid - 1;
				else
					right = mid + 1;
			} else {
				if (flag)
					left = mid + 1;
				else
					left = mid - 1;
			}

		}
		return -1;
	}

	private static int mountainFirst(int[] a, int i) {

		int left = 1;
		int right = a.length - 2;
		if (a[0] > a[1]) {
			return 0;
		}
		if (a[a.length - 1] > a[a.length - 2]) {
			return a.length - 1;
		}
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
				return mid;
			} else if (a[mid + 1] > a[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return right;
	}
}
