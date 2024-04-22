package LI;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] memoized = new int[input];
	

	recurFib(input);

	}

	private static void recurFib(int number) {
		int count=2;
		
		int f1=0;
		int f2=1;
		int f3=0;
		while(count<=number)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			count++;
		}
		System.out.println(f3);
		
}
}
