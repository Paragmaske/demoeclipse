package bst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

public class SCHEDULE {
	public static void main(String[] args) {
		String s = "aaabbbb";
		int n = 2;

		Map<Character, Integer> hm = new HashMap<>();

		for (Character c : s.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}

		Queue<Map.Entry<Character, Integer>> p = new PriorityQueue<Map.Entry<Character, Integer>>(
				(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) -> b.getValue() - a.getValue());
		for (Map.Entry<Character, Integer> ENTRY : hm.entrySet()) {
			p.add(ENTRY);
		}
		int totalBlocks = 0;
		int vacant = 0;
		while (!p.isEmpty()) {
			Entry<Character, Integer> poll = p.poll();
			totalBlocks = (poll.getValue() * n )+ 1;
			vacant = totalBlocks - poll.getValue();
		}
	}
}
