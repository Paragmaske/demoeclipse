package LI;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class lruCACHE {

	Deque<Map<Integer, Integer>> dqueue;
	int capacity;

	public lruCACHE(int capacity) {
		dqueue = new ArrayDeque<Map<Integer, Integer>>(capacity);
		this.capacity = capacity;
	}

	public int get(int key) {
		boolean flag = false;
		Integer value = null;
		for (Map<Integer, Integer> hm : dqueue) {
			if (hm.containsKey(key)) {
				flag = true;
				value = hm.get(key);
				dqueue.remove(hm);
				break;
			}
		}
		if (flag) {
			Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
			hm.put(key, value);
			dqueue.addLast(hm);
		}

		return (flag) ? value : -1;
	}

	public void put(int key, int value) {

		for (Map<Integer, Integer> hm : dqueue) {
			if (hm.containsKey(key)) {
				hm.put(key, value);
				Map<Integer, Integer> hmNew = hm;
				dqueue.remove(hm);
				dqueue.addLast(hmNew);
				return;
			}

		}
		if (dqueue.size() >= capacity) {
			dqueue.removeFirst();
		}
		Map hm = new HashMap<Integer, Integer>();
		hm.put(key, value);
		dqueue.addLast(hm);
	}

	public static void main(String[] args) {
		lruCACHE lRUCache = new lruCACHE(2);
		
		lRUCache.get(2); 
		lRUCache.put(2, 1);
		lRUCache.put(1, 1);
		lRUCache.put(2,3);
		lRUCache.put(4,1);
		lRUCache.get(1); 
		lRUCache.get(2); 
	}
}
