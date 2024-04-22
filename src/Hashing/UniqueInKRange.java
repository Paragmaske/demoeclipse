package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class UniqueInKRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		int[] ar = new int[a];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();

		}

		int rangeCount = 0;
		HashMap<Integer, Integer> hs = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			

			hs.put(ar[i], hs.getOrDefault(ar[i], 0) + 1);

			rangeCount++;
			if (rangeCount == b) {
				System.out.print(hs.size()+" ");

				if (hs.get(ar[i - b+1]) == 1) {
					hs.remove(ar[i - b+1]);
				} else {
					hs.put(ar[i - b+1], hs.get(ar[i - b+1]) - 1);
				}
				rangeCount--;
			}
			

		}
	}

	private static int calUniqueInHs(HashMap<Integer, Integer> hs) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		int count = 0;
		for (Map.Entry<Integer, Integer> entr : hs.entrySet()) {
			// set.add(entry.getley)
		}
		return count;
	}

}
