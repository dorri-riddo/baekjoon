package b_10569;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while (T-- > 0) {
			sb.append((2 - sc.nextInt() + sc.nextInt()) + "\n");
		}
		sc.close();
		System.out.print(sb.toString());

	}

}
