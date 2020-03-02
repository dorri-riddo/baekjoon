package b_10991;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/10991
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		// 맨처음 빈공간
		int n = N - 1;
		
		for (int i = 0; i < n; i++) {
			sb.append(' ');
		}
		sb.append('*' + "\n");
		n--;
		
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(' ');
			}
			for (int j = 0; j < i + 1; j++) {
				sb.append("* ");
			}
			sb.append('\n');
			
			n--;
		}
		
		System.out.print(sb.toString());
		
	}
}
