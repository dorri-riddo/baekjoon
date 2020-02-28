package b_2440;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2440
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		while(N-- > 0) {
			for (int i = N; i >= 0; i--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}
