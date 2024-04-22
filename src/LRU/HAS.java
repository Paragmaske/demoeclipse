package LRU;

import java.util.HashMap;
import java.util.Map;

public class HAS {
public static void main(String[] args) {
	HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	hm.put(1, 2);
	hm.put(1, 3);
	 
	for(Map.Entry<Integer, Integer> en:hm.entrySet())
	{
		System.out.println(en.getKey() +"  --"+en.getValue());
	}
}
}
