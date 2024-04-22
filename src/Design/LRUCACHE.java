package Design;

import java.util.*;

class Lru<Integer, String> extends LinkedHashMap<Integer, String> {
	private final int capacity;

	public Lru(int capacity) {
		super(capacity, 1f, true);
		this.capacity = capacity;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
		return size() > capacity;
	}
}

public class LRUCACHE {

	public static void main(String[] args) {

		Lru<Integer, String> lru = new Lru(3);
		lru.put(1, "one");
		lru.put(2, "two");

		lru.put(3, "three");
		printHashMap(lru);
		
		System.out.println("------");
		lru.get(2);
		printHashMap(lru);

	}

	private static void printHashMap(LinkedHashMap<Integer, String> lru) {
		for (Map.Entry<Integer, String> hm : lru.entrySet()) {
			System.out.println(hm.getValue());
		}
	}

}
