package StackAndQueues;

import java.util.*;



public class BracketMatching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] matchBracket = matchBracket(s);
		for (int i : matchBracket) {
			System.out.print(i + " ");
		}
	}

	private static int[] matchBracket(String s) {
		int ans[] = new int[s.length()];
		Arrays.fill(ans, -1);
		Stack<stackComponents> helper = new Stack<stackComponents>();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char currentChar = s.charAt(i);
			if ('(' == currentChar) {
				helper.push(new stackComponents(i, currentChar));
			} else if (!helper.isEmpty() && helper.peek().bracketType == '(' && currentChar == ')') {
				ans[i] = helper.peek().index;
				ans[helper.peek().index] = i;
				helper.pop();
			} else {
				helper.push(new stackComponents(i, currentChar));
			}
		}

		return ans;
	}
}
class stackComponents {
	int index;
	Character bracketType;

	public stackComponents(int index, Character bracketType) {
		super();
		this.index = index;
		this.bracketType = bracketType;
	}

	public stackComponents() {
		super();
	}

}