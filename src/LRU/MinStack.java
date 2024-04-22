package LRU;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MinStack {
	Stack<int[]> s;

	public MinStack() {
		s = new Stack<int[]>();
	}

	public void push(int val) {

		if (s.isEmpty()) {

			int[] ele = { val, val };
			s.push(ele);
		} else {
			int[] newEle = { val, Math.min(val, s.peek()[1]) };

			s.push(newEle);
		}

	}

	public void pop() {

		if (!s.isEmpty()) {
			s.pop();
		}
	}

	public int top() {
		if (!(s.isEmpty())) {
			return s.peek()[0];
		}
		return 0;
	}

	public int getMin() {

		if (!(s.isEmpty())) {
			return s.peek()[1];
		}
		return 0;

	}

	public static void main(String[] args) {
		MinStack m = new MinStack();
		m.push(-2);
		m.push(0);
		m.push(-1);
		m.getMin();

		m.top();
		m.pop();
		m.getMin();
	}

}
