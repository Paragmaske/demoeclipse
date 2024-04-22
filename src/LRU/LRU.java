package LRU;

import java.util.LinkedHashMap;

public class LRU {
	int capacity;
	LinkedHashMap<Integer, Integer> train;

	public LRU(int capacity) {
		train = new LinkedHashMap<Integer, Integer>(capacity, 1f, true);
	}

	public int get(int key) {
		return key;

	}

	public void put(int key, int value) {

	}
}
