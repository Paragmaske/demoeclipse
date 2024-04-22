package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class PostFixEvaluation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] split = input.split(" ");

		Stack<Integer> helper = new Stack<Integer>();
		for (String s : split) {
			if (Character.isDigit(s.charAt(0))) {
				helper.push(Character.getNumericValue(s.charAt(0)));
			} else {
				int ans = 0;
				char charAt = s.charAt(0);
				int b = helper.pop();
				int a = helper.pop();
				switch (charAt) {
				case '+':
					ans = a + b;
					break;
				case '-':
					ans = a - b;
					break;
				case '*':
					ans = a * b;
					break;
				case '/':
					ans = a / b;
					break;
				}
				char asciiValue = (char) ans;
				helper.push(ans);
			}
		}
		
		System.out.println(helper.pop());
	}
}
