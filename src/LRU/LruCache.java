package LRU;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class LruCache {
	int capacity;
	Set<Integer> data;
	Deque<Integer> link;

	public LruCache(int capacity) {
		super();
		this.capacity=capacity;
		this.data = new HashSet<Integer>(capacity);
		this.link = new ArrayDeque<>(capacity);
	}

	void addInLru(int ele) {
		if (data.size() == capacity) {
			Integer removeFirst = link.removeFirst();
			data.remove(removeFirst);
		}
		link.addLast(ele);
		data.add(ele);
	}

	boolean look(int ele) {
		if (data.contains(ele)) {
			link.remove(ele);
			link.addLast(ele);
		}
		return false;
	}
	
	 void printLru()
	{
		for(int i:link)
		{
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {

		LruCache newCache = new LruCache(3);
		newCache.addInLru(1);
		newCache.printLru();
		System.out.println();
		newCache.addInLru(2);
		newCache.printLru();
		System.out.println();
		newCache.addInLru(3);
		newCache.printLru();
		System.out.println();
		newCache.addInLru(4);
		newCache.printLru();
		System.out.println();
		newCache.look(3);
		newCache.printLru();
		System.out.println();
		newCache.addInLru(5);
		newCache.printLru();






	}

}
