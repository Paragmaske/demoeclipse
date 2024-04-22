package LI;

import java.util.Arrays;
import java.util.HashSet;

public class aadad {
	static HashSet<Integer> hs = new HashSet<Integer>();

	public static void main(String[] args) {
		int[] a = {  3, 2, 7, 4, 1 };
		int sum = 0;
		for (int i : a) {
			sum =sum+ i;
		}
		recur(a, 0, sum);
		int minValue = Integer.MAX_VALUE;

		for (int i : hs) {
			if (i < minValue) {
				minValue = Math.min(i, minValue);
			}
		}
		System.out.print(minValue);
	}

	private static void recur(int[] a, int i, int sum) {

		if (a.length == 0) {
			hs.add(Math.abs(i-(sum-i)));
			return;
		}
		recur(Arrays.copyOfRange(a, 1, a.length), i + a[0], sum);
		recur(Arrays.copyOfRange(a, 1, a.length), i, sum);
	}
}
