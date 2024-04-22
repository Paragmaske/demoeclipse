
public class MedianOfTwoSortedArray {
	public static void main(String[] args) {
		int[] b = { 1 };
		int[] a = { 2, 4, 8, 10 };

		calMedian(a, b);
	}

	private static void calMedian(int[] a, int[] b) {

		if (a.length > b.length) {
			calMedian(b, a);
		}

	}
}
