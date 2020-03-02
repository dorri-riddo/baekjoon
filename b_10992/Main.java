package b_10992;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/10992
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		int n = N - 1;
		int m = 1;
		
		for (int i = 0; i < n; i++) {
			sb.append(' ');
		}
		sb.append('*' + "\n");
		n--;
		
		for (int i = 1; i < N - 1; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(' ');
			}
			sb.append('*');
			for (int j = 0; j < m; j++) {
				sb.append(' ');
			}
			sb.append('*');
			sb.append('\n');
			
			n--;
			m += 2;
		}
		
		if (N != 1) {
			for (int i = 0; i < 2 * N - 1; i++) {
				sb.append('*');
			}
		}

		
		System.out.print(sb.toString());
		
	}
}
