package LI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
	public static void main(String[] args) {
		int rows = 5;
		List<List<Integer>> pascal = pascal(rows);
		System.out.println(pascal);
	}

	private static List<List<Integer>> pascal(int rows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		list.add(new ArrayList<Integer>(Arrays.asList(1)));
		int ans = 1;

		for (int i = 1; i < rows; i++) {
			List<Integer> newList = new ArrayList<Integer>();
			ans = ans * 11;
			String valueOf = String.valueOf(ans);
			for (int j = 0; j < valueOf.length(); j++) {

				newList.add(Integer.valueOf(valueOf.charAt(j)));

			}
			list.add(newList);

		}
		return list;

	}
}
