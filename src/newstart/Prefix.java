package newstart;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Prefix {
	public static void main(String[] args) {
		String[] a = { "ar", " arp", "fin", "finance", "lb", "win", "winner" };
		crackMicro(a);
	}

	private static void crackMicro(String[] a) {
		HashMap<String, Integer> hm = new HashMap<>();

		for (String i : a) {
			hm.put(i, 0);
		}
		for (String i : a) {
			for (String j : a) {
				if (!i.equals(j)) {
					if (j.contains(i)) {
						hm.put(j, hm.get(j) + 1);
					}
				}
			}
		}

		for (Map.Entry<String, Integer> en : hm.entrySet()) {
			if (en.getValue() == 0) {
				System.out.println(en.getKey());
			}
		}
	}
}
