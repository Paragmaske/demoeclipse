package BinarySearch;

public class MiniMiseMaxPage {
	public static void main(String[] args) {
		int[] a = {12 ,34, 67, 90};

		System.out.println(minMaxPages(a, a.length, 5));

	}

	private static int minMaxPages(int[] A, int N, int M) {

		
		if(M>A.length) return -1;
		int max = 0;
		int sum = 0;
		for (int iNDEX : A) {
			sum = sum + iNDEX;
			max = Math.max(max, iNDEX);
		}

		int left = max;
		int right = sum;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (pred(mid, A) <= M) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}
		return left;

	}

	private static int pred(int mid, int[] a) {
		int pages = 1;
		int count = 0;
		for (int i : a) {
			count += i;
			if (count > mid) {
				pages++;
				count = i;
			}
		}
		return pages;
	}
}
