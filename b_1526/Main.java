package b_1526;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String result = "";
		boolean isTrue = true;
		sc.close();
		
		for (long i = n; i >= 0; i--) {
			String s = "" + i;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) != '4' && s.charAt(j) != '7') {
					isTrue = false;
					break;
				}
			}
			if (isTrue) {
				result = s;
				break;
			}
			isTrue = true;
		}
		System.out.print(result);

	}

}
