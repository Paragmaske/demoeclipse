package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FreqSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] ar = new int[a];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();

		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : ar) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}
		List<Map.Entry<Integer, Integer>> l = new ArrayList<Map.Entry<Integer, Integer>>();
		l.addAll(hm.entrySet());

		Comparator<Map.Entry<Integer, Integer>> comp = new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				int a =o2.getValue()-o1.getValue();
				if(a==0)
				{
					return o1.getKey()-o2.getKey();
				}
				return a;
			}

		
		};
		Collections.sort(l, comp);

		Map<Integer, Integer> hm1 = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> en : l) {
			hm1.put(en.getKey(), en.getValue());
		}

		for (Map.Entry<Integer, Integer> en1 : hm1.entrySet()) {
			int count = en1.getValue();
			while (count > 0) {
				System.out.print(en1.getKey() + " ");
				count--;
			}
		}
	}
}
