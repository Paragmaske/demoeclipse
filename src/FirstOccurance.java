
public class FirstOccurance {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 5,5, 6, 8 };

		findFirst(a, 81);
	}

	private static void findFirst(int[] a, int target) {

		int left = 0;
		int right = a.length - 1;
		int leftp = 0;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (a[mid] <= target) {
				leftp = mid;
				left = mid + 1;
			} else {
			right=mid-1;
			}
		}

		System.out.println(leftp);
	}
}
