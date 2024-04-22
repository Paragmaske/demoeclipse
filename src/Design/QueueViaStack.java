package Design;

import java.util.Scanner;
import java.util.Stack;

public class QueueViaStack {

	public static void main(String[] args) {
		Stack<Integer> helperStack = new Stack<>();
		Stack<Integer> originalStack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String s = sc.nextLine();
			switch (s) {
			case "add":
				int a = sc.nextInt();
				addToQueue(a, originalStack, helperStack);
				break;

			case "remove":
				removeFromQueue(originalStack, helperStack);
				break;
			case "peek":
				peekQueue(originalStack, helperStack);
				break;
			}

		}
	}

	private static void peekQueue(Stack<Integer> originalStack, Stack<Integer> helperStack) {

		while (!helperStack.isEmpty()) {
			originalStack.add(helperStack.pop());
		}
		System.out.println(originalStack.peek() + " is peek");

		while (!originalStack.isEmpty()) {
			helperStack.add(originalStack.pop());
		}
	}

	private static void removeFromQueue(Stack<Integer> originalStack, Stack<Integer> helperStack) {
		while (!helperStack.isEmpty()) {
			originalStack.add(helperStack.pop());
		}
		System.out.println(originalStack.pop() + " popped ");

		while (!originalStack.isEmpty()) {
			helperStack.add(originalStack.pop());
		}
	}

	private static void addToQueue(int input, Stack<Integer> originalStack, Stack<Integer> helperStack) {
		helperStack.add(input);
		System.out.println("added " + input);
	}
}
