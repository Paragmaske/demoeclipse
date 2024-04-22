package bst;

import java.util.concurrent.RecursiveAction;

public class hellorecur {
	public static void main(String[] args) {
		int k = 3;
		calRec(3);
	}

	private static void calRec(int k) {

		if (k == 1) {
			System.out.println("solved maze");
			return;
		}
		calRec(--k);
	}
}
