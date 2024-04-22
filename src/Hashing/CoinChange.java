package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CoinChange {
	static Set<Map<Integer, Integer>> mega = new HashSet<>();

	public static void main(String[] args) {
		int[] a = {50,100,200,500};
		int make = 5;
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		printRecurs(a, 600, hm);
		if (mega.isEmpty()) {
			System.out.println("It's not possible to make the amount ");
		} else {
			System.out.println(mega);
		}
	}

	private static void printRecurs(int[] a, int amount, Map<Integer, Integer> hm) {
		if (amount == 0) {
			mega.add(new HashMap<Integer, Integer>(hm));
			return;
		}

		for (int k = 0; k < a.length; k++) {
			if (amount >= a[k]) {
				Map<Integer, Integer> newList = new HashMap<>(hm); // Create a new list for each recursion
				newList.put(a[k], newList.getOrDefault(a[k], 0) + 1);
				printRecurs(a, amount - a[k], newList);
			}
		}
	}
}
