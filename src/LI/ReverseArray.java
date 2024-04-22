package LI;

public class ReverseArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		recurRev(a, 0, a.length - 1);
		for (int i : a) {
			System.out.println(i);
		}
	}

	private static void recurRev(int[] a, int start, int end) {

		if (start < (end - 1) / 2) {
			swapNumbers(a, start, end - 1);
			recurRev(a, start + 1, end - 1);
		}

	}

	private static void swapNumbers(int[] a, int start, int end) {
		int temp = a[start];
		a[start] = a[a.length - 1 - start];
		a[a.length - 1 - start] = temp;
	}
}
