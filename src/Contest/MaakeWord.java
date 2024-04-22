package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MaakeWord {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		String[] input = new String[testcase * 2];
		sc.nextLine();
		for (int i = 0; i < input.length; i++) {
			String s = sc.nextLine();
			input[i] = s;
		}

		for (int i = 0; i < input.length; i = i + 2) {
			System.out.print(makeWord(input[i], input[i + 1]));
		System.out.println();
		}

	}

	private static int makeWord(String original, String helper) {
		Map<Character, List<Integer>> hm = new HashMap<>();

		for (int i = 0; i < helper.length(); i++) {

			if (hm.containsKey(helper.charAt(i))) {
				List<Integer> list = hm.get(helper.charAt(i));
				list.add(i);
				hm.put(helper.charAt(i), list);
			} else {
				List<Integer> defau = hm.getOrDefault(helper.charAt(i), new ArrayList<Integer>());
				defau.add(i);
				hm.put(helper.charAt(i), defau);
			}
		}
		int prev = -1;
		int occurance = 1;
		for (int i = 0; i < original.length(); i++) {
			if (!hm.containsKey(original.charAt(i)))
				return -1;
			int binearySearch = binearySearch(original.charAt(i), hm.get(original.charAt(i)), prev);
			if (binearySearch == -1) {
				return -1;
			}

			if (binearySearch > prev) {
				prev = binearySearch;
			} else {
				prev = binearySearch;
				occurance++;

			}
		}
		return occurance;

	}

	private static int binearySearch(char charAt, List<Integer> a, int prev) {
		if (a.size() == 1) {
			return a.get(0);
		}

		int left = 0;
		int right = a.size() - 1;
		int probans = 0;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (a.get(mid) > prev) {
				probans = a.get(mid);
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return probans;
	}
}
