package LI;

public class PositiveNegative {
	public static void main(String[] args) {
		int[] a = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		posNegAlternate(a);
	}
//1 2  4 -6 -7 -8

	private static void posNegAlternate(int[] numbers) {
		int n = numbers.length;

		int positiveIndex = 0;
		int negativeIndex = 0;

// Move all negative numbers to the beginning
		for (int i = 0; i < n; i++) {
			if (numbers[i] < 0) {
				// Swap negative numbers with the first positive number
				int temp = numbers[i];
				numbers[i] = numbers[negativeIndex];
				numbers[negativeIndex] = temp;

				negativeIndex++;

				// Move the positiveIndex to the next positive number
				positiveIndex = negativeIndex;
			}
		}

// Now, positiveIndex points to the first positive number

// Rearrange positive and negative numbers alternately
		while (positiveIndex < n && negativeIndex < n && numbers[positiveIndex] >= 0) {
			// Swap positive and negative numbers
			int temp = numbers[positiveIndex];
			numbers[positiveIndex] = numbers[negativeIndex];
			numbers[negativeIndex] = temp;

			positiveIndex++;
			negativeIndex += 2;
		}
		for (int i : numbers) {
			System.out.println(i);
		}
	}

}
