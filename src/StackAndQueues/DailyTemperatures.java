package StackAndQueues;

import java.util.Stack;

public class DailyTemperatures {

	public static void main(String[] args) {
		int[] a = { 73, 74, 75, 71, 69, 72, 76, 73 };
		dailyTemperatures(a);
	}

	static int[] dailyTemperatures(int[] temperatures) {
		Stack<Integer> s = new Stack<Integer>();
		int[] ans = new int[temperatures.length];
		for (int i = temperatures.length - 1; i >= 0; i--) {
			if (s.isEmpty()) {
				ans[i] = 0;
			} else {
				boolean flag = false;
				while (!s.isEmpty()) {
					if (temperatures[s.peek()] > temperatures[i]) {
						flag = true;
						ans[i] = s.peek() - i;
						break;
					} else {
						s.pop();
					}
				}
				if (flag == false)
					ans[i] = 0;

			}
			s.push(i);
		}
		return ans;
	}
}
