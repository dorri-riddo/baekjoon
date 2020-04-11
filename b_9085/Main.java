package b_9085;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while(T-- > 0) {
			int sum = 0;
			int n = sc.nextInt();
			while(n-- > 0) {
				sum += sc.nextInt();
			}
			sb.append(sum + "\n");
		}
		sc.close();
		
		System.out.print(sb.toString());
	}

}
