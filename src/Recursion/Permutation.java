package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	static List<String> finalAns = new ArrayList<String>();

	public static void main(String[] args) {
		String s = "abc";

		generate(s, "");
	}

	private static void generate(String subString, String ans) {

		if (subString.length() == 0) {

			System.out.println(ans);
			finalAns.add(ans);

			return;
		}
		generate(subString.substring(1), ans + subString.charAt(0));

		generate(subString.substring(1), ans);
	}
}