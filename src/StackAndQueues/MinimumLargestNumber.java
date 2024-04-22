package StackAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MinimumLargestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int inp=sc.nextInt();
		int[] a =new int[inp];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Stack<Integer> s = new Stack<Integer>();
		Queue<Integer> helper = new LinkedList<>();
		for (int i = 0; i < a.length; i++) {
			if (s.isEmpty()) {
				System.out.print(-1 + " ");
				s.push(a[i]);
			} else {
				boolean flag = false;
				while (!s.isEmpty()) {
					if (s.peek() > a[i]) {
						flag = true;
						System.out.print(s.peek() + " ");
						while (!helper.isEmpty()) {
							s.add(helper.remove());
						}
						s.add(a[i]);
						break;
					} else {
						helper.add(s.pop());
					}
				}
				if (!flag) {
					System.out.print(-1 + " ");
					while (!helper.isEmpty()) {
						s.add(helper.remove());
					}
					s.add(s.push(a[i]));
				}
			}
		}
	}
}
