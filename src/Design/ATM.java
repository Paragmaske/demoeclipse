package Design;

import java.util.Arrays;

class ATM {
	static int[] a;

	public ATM() {
		a = new int[5];
		Arrays.fill(a, 0);
	}

	public static void deposit(int[] banknotesCount) {
		for (int i = 0; i < banknotesCount.length; i++) {
			a[i] = a[i] + banknotesCount[i];
		}
	}

	public static int[] withdraw(int amount) {

		for (int i = a.length - 1; i >= 0; i--) {

			int denominaton = 0;
			switch (i) {
			case 0:
				denominaton = 20;
				break;
			case 1:
				denominaton = 50;
				break;
			case 2:
				denominaton = 100;
				break;
			case 3:
				denominaton = 200;
				break;
			case 4:
				denominaton = 500;
				break;
			}

			if (amount < denominaton) {
				continue;
			} else {
				int notesUSed = 0;
				while (amount >= denominaton) {
					amount -= denominaton;
					notesUSed++;
				}
				a[i] -= notesUSed;
			}
			if (amount == 0)
				break;

		}
		return a;

	}

	public static void main(String[] args) {
		ATM machine = new ATM();
		machine.deposit(new int[] { 0, 0, 1, 2, 1 });
		ATM.withdraw(600);
		ATM.deposit(new int[] {0,1,0,1,1});
		ATM.withdraw(600);
		machine.withdraw(550);
		
	}
}