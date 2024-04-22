
public class Substringswithsame {
	public static void main(String[] args) {
		String s = "aaba";

		char[] charArray = s.toCharArray();
		int count = 0;
		int occur = 0;
		for (char ch : charArray) {

			if (ch == 'a') {

				count = count + occur + 1;
				occur = occur + 1;
			}

		}
		System.out.println(count);
//		int count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == 'a') {
//				count++;
//				if (i == s.charAt(i)) {
//					count++;
//				} else {
//					for (int j = i + 1; j < s.length(); j++) {
//						if (s.charAt(j) == 'a') {
//							count++;
//						}
//					}
//				}
//			}
//		}System.out.println(count);
	}
}
