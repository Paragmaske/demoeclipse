package newstart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubSetSum {
	static List<Long> hs = new ArrayList<Long>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		long[] a = new long[in];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
//1 
		long totalSum = 0;
		for (long i : a) {
			totalSum = totalSum + i;
		}
		subSeq(a, 0, totalSum);

		long MinVal = Integer.MAX_VALUE;
		for (long i : hs) {
			if (i < MinVal) {
				MinVal = Math.min(MinVal, i);
			}
		}
		System.out.println(MinVal);
	}

	private static void subSeq(long[] a, long ans, long totalSum) {
		if (a.length == 0) {

			hs.add(Math.abs(ans - (totalSum - ans)));

			return;
		}

		subSeq(Arrays.copyOfRange(a, 1, a.length), ans + a[0], totalSum);
		subSeq(Arrays.copyOfRange(a, 1, a.length), ans, totalSum);
	}
}
