package b_2556;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2556
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append('*');
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());

	}

}
