package newstart;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4 };
		int target = 6;
		twoSum(a, target);
	}

	private static void twoSum(int[] a, int target) {
		int left = 0;
		int right = a.length - 1;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (hm.containsKey(target - a[mid])) {
				System.out.println(mid + " " + hm.get(target - a[mid]));
				break;
			} else {
				hm.put(a[mid], mid);
			}
		}
	}
}
