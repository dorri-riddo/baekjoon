package b_2441;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2441
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int copyN = N;
		
		while(copyN-- > 0) {
			for (int i = 0; i < N - copyN - 1; i++) {
				sb.append(" ");
			}
			for (int i = copyN; i >= 0; i--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}
