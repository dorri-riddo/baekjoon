package b_9325;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while(n-- > 0) {
			int sum = sc.nextInt();
			int t = sc.nextInt();
			while (t-- > 0) {
				sum += sc.nextInt() * sc.nextInt();
			}
			sb.append(sum + "\n");
		}
		sc.close();

		System.out.print(sb.toString());
	}

}
