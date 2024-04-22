package bst;

import java.util.Stack;

import StackAndQueues.LargestRectangularArea;

public class MAXAREAOFHISTOGRAM {
	public static void main(String[] args) {
		int[] a = {2,1,5,6,2,3};
		System.out.println(largestRectangleArea(a));
	}

	public static int largestRectangleArea(int[] a) {
		int[] leftMin = new int[a.length];
		int[] rightMin = new int[a.length];
		int ans = Integer.MIN_VALUE;

		Stack<Integer> leftStack = new Stack<Integer>();
		Stack<Integer> rightStack = new Stack<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (leftStack.isEmpty()) {
				leftMin[i] = 0;
			} else {
				boolean flag = false;
				while (!leftStack.isEmpty()) {
					if (a[leftStack.peek()] >= a[i]) {
						leftStack.pop();
					} else {
						flag = true;
						leftMin[i] = leftStack.peek();
						break;
					}

				}
				if (!flag)
					leftMin[i] = 0;
			}
			leftStack.add(i);
		}

		for (int i : leftMin) {
			System.out.print(i+" ");
		}
		System.out.println();

		for (int i = a.length - 1; i >= 0; i--) {
			if (rightStack.isEmpty()) {
				rightMin[i] = a.length - 1;
			} else {
				boolean flag = false;
				while (!rightStack.isEmpty()) {
					if (a[rightStack.peek()] > a[i]) {
						rightStack.pop();
					} else {
						flag = true;
						rightMin[i] = rightStack.peek();
						break;
					}

				}
				if (!flag)
					rightMin[i] = a.length - 1;
			}
			rightStack.add(i);
		}
		for (int i : rightMin) {
			System.out.print(i+" ");
		}
		System.out.println();

		for (int i = 0; i < a.length ; i++) {
			ans = Math.max(ans, a[i] * (rightMin[i] - leftMin[i]));
		}
		return ans;
	}
}
