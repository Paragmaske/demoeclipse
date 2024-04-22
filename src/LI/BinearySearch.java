package LI;

public class BinearySearch {
	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 6, 7, 8, 123 };

		binarySearch(a, 0, a.length - 1, 2);
	}

	private static void binarySearch(int[] a, int start, int end, int element) {

		int mid = start + (end - start) / 2;
		if (start <= end) {
			if (element == a[mid]) {
				System.out.println("index " + mid);
				return;
			} else if (a[mid] > element) {
				binarySearch(a, start, mid - 1, element);
			} else {
				binarySearch(a, mid + 1, end, element);

			}
		} else {
			System.out.println("element not found");
			return;
		}
	}
}
