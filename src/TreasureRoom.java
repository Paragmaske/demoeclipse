import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TreasureRoom {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] input = new int[a];

		for (int i = 0; i < a; i++) {
			input[i] = sc.nextInt();
		}
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < input.length; i++) {
			if (hm.containsKey(b - input[i])) {
				System.out.println(hm.get(b - input[i]) + " " + (i + 1));
				System.exit(0);
			} else {
				hm.put(input[i], i + 1);
			}
		}

		System.out.println(-1);

	}
}
