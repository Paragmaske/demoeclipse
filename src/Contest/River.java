package Contest;

import java.util.Scanner;

public class River {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] in = new int[a];

		for (int i = 0; i < in.length; i++) {
			in[i] = sc.nextInt();
		}

		for (int i : in) {
			System.out.println(BinearySearch(i, i -1));
		}
	}

	private static int BinearySearch(int i, int target) {
		int left = 0;
		int right = i;
		int count = 0;

		while (left <= right) {
			count++;
			int mid = left + (right - left) / 2;
			if (mid == target) {
				return count;
			} else if (target > mid) {
				left = mid ;

			} else {
				right = mid ;

			}

		}
		return -1;
	}
}
