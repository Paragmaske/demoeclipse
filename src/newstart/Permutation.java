package newstart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Permutation {
	static List<String> ans=new ArrayList<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String in = sc.nextLine();
		// subString(a, "");

		permute(in, 0, in.length() - 1);
		Collections.sort(ans);
		for(String s :ans)
		{
			System.out.println(s);
		}
	}

	private static void permute(String givenString, int left, int right) {
		if (left == right) {
			ans.add(givenString);
		} else {
			for (int pointer = left; pointer <= right; pointer++) {
				givenString = swap(givenString, left, pointer);
				permute(givenString, left + 1, right);
				givenString = swap(givenString, left, pointer);
			}
		}

	}

	private static String swap(String givenString, int left, int right) {

		char[] charArray = givenString.toCharArray();
		char tempp = charArray[left];
		charArray[left] = charArray[right];
		charArray[right] = tempp;
		return String.valueOf(charArray);

	}

//	private static void subString(String a, String ans) {
//
//		if (a.length() == 0) {
//			System.out.println(ans);
//			return;
//		}
//
//		subString(a.substring(1), ans + a.charAt(0));
//		subString(a.substring(1), ans);
//
//	}
}
