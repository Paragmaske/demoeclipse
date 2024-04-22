package Design;

public class HelloWorld {
	public static void main(String[] args) {
		add(1);
		add(1, 2);
		add(1, 2, 3, 4);
	}

	public static void add(int... a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		System.out.println(sum);
	}
}
