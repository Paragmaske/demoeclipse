import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ClosestRefugee {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int[] input = new int[a];

		for (int i = 0; i < a; i++) {
			input[i] = sc.nextInt();
		}

		Set<Integer> hs = new HashSet<Integer>();
		for (int i : input) {
			Integer c=i;
			hs.add(c);
		}

		for (int i = 0; i < a; i++) {
			if (!hs.contains(i + 1)) {
				System.out.println(i + 1);
				System.exit(0);
			}
		}
		
		System.out.println("-1");

	}
}
