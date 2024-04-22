package BinarySearch;

import java.util.Arrays;

public class CapacityToStoreWithinDdays {
	public static void main(String[] args) {
		int[] a = { 1,2,3,1,1};
		int days = 4;

		System.out.println(capac(a, days));
	}

	private static int capac(int[] a, int days) {

		int ans = 0;
		int MaxWeightOnShip = Integer.MIN_VALUE;
		int totalWeightOfShip = 0;
		for (int i : a) {
			totalWeightOfShip = totalWeightOfShip + i;
			if (i > MaxWeightOnShip) {

				MaxWeightOnShip = Math.max(i, MaxWeightOnShip);
			}
		}

		int left = MaxWeightOnShip;
		int right = totalWeightOfShip;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (pred(mid, a)-days <=0 ) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}
		return left;
	}

	private static int pred(int capacity, int[] a) {
		int totalWeight = 0;
		int sumOFdays = 1;
		for (int i : a) {
			totalWeight = totalWeight + i;
			if (totalWeight > capacity) {
				totalWeight = i;
				sumOFdays++;
			}
		}
		return sumOFdays;
	}
}
