import java.util.Scanner;

public class SideOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int[] an = new int[a];

		for (int i = 0; i < an.length; i++) {
			an[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < an.length; i++) {
			for (int j = i + 1; j < an.length; j++) {
				for (int k = j + 1; k < an.length; k++) {
					if(((an[i]+an[j])>an[k]) && ((an[j]+an[k])>an[i] ) && ((an[i]+an[k])>an[j]))
					{
					count++;}
				}
			}
		}
		System.out.println(count);
	}
}
