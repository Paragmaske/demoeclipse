package bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayD {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 6, 9);

		List<Integer> l=new ArrayList<Integer>();
		if(((List) l).isEmpty())
		{
			System.out.println("ndsd");
		}
		
		//printRecur(li, 0);
	}

	private static void printRecur(List<Integer> li, int counter) {
		if (counter == li.size() - 1) {
			System.out.println(li.get(counter));
			return;
		}
		System.out.println(li.get(counter));
		printRecur(li, ++counter);
	}
}
