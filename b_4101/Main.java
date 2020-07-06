package b_4101;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) {
				break;
			}
			
			if (n > m) {
				sb.append("Yes\n");
			} else {
				sb.append("No\n");
			}
		}
		sc.close();
		System.out.print(sb.toString());
	}

}
