package bst;

public class ArraySort {
	public static void main(String[] args) {
		int[] a = { 7, 8, 1, 4,51,6,25,12,74,45 };
		sort(a, 0, a.length - 1);

		for (int i : a) {
			System.out.println(i);
		}
	}

	private static void sort(int[] a, int start, int end) {
		// function index max element in range of start and end
		if (start == end) {
			return;
		}
		int maxIndex = maxIndex(a, start, end);
		swap(a, maxIndex, end);
		sort(a, start, end - 1);
	}

	private static void swap(int[] a, int maxIndex, int end) {

		int temp = a[maxIndex];
		a[maxIndex] = a[end];
		a[end] = temp;;
	}

	private static int maxIndex(int[] a, int start, int end) {
		int max = 0;
		int ele=0;
		for (int i = start; i <= end; i++) {
			if (a[i] > ele) {
				
				ele = a[i];
				max=i;
			}
		}
		return max;
	}
}
