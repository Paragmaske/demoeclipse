package newstart;

public class FirstAndLastOcc {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 3, 3, 4 };
		first(a, 3);
	}

	private static void first(int[] a, int i) {

		int left = 0;
		int right = a.length - 1;

		while (left + 1 < right) {
			int mid = (left + right) / 2;
			if (a[mid] < i) {
				left = mid;
			} else {
				right = mid;
			}
		}
		System.out.println(right);
		left = 0;right = a.length - 1;
		while (left + 1 < right) {
			int mid = (left + right) / 2;
			if (a[mid] >= i) {
				left = mid;
			} else {
				right = mid;
			}
		}
		System.out.println(left);

	}
}

//a[mid] >= target left=mid last occurance
//a[mid] < target  left = mid;
