package LI;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
	public static void main(String[] args) {
		String s = "abc";
		subSeq(s, 0, "");
	}

	private static void subSeq(String s, int i, String string) {

		if (i == s.length()) {
			return;
		}

		subSeq(s, i + 1, string);
	 string=string	+s.charAt(i);
		System.out.println(string);

	 subSeq(s, i + 1, string);
	}

}
