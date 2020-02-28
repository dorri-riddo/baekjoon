package b_2446;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2446
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();

		int temp = 0;
		int count = N + 1;
		
		while(count-- > 1) {
			for (int i = 0; i < temp; i++) {
				sb.append(" ");
			}
			temp++;
			for (int i = 2 * count - 1; i > 0; i--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		temp = (2 * N - 1) / 2 - 1;
		count = 1;
		
		while(count++ < N) {
			for (int i = 0; i < temp; i++) {
				sb.append(" ");
			}
			temp--;
			for (int i = 0; i < 2 * count - 1; i++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		
		System.out.print(sb.toString());
	}
}
