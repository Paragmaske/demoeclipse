package bst;

public class mountain {
	public static void main(String[] args) {
		int[] i = { 1, 6};
		moun(i);
	}

	private static void moun(int[] a) {
		int left = 1;
		int right = a.length - 1;
		if(a[0]>a[1]) {
			System.out.println(0);
			System.exit(0);
		}

		while (left <= right) {
			int mid = (left + right) / 2;

			if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
				System.out.println(mid);
				break;
			} else if (a[mid] < a[mid - 1]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
	}
}
