package newstart;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("account1", 1000);
		hm.put("account2", 1200);
		hm.put("account3", 1100);
//		hm.put("account4", 16);

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int ans = hm.get(o2) - hm.get(o1);
				return (ans == 0) ? o1.compareTo(o2) : ans;

			}
		});

		tm.putAll(hm);

		for (Map.Entry<String, Integer> en : tm.entrySet()) {
			System.out.println(en.getValue() + en.getKey());
		}

	}
}
