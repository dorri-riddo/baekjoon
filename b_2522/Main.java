package b_2522;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2522
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int copyN = N;
		
		while(copyN-- > 0) {
			for (int i = 0; i < copyN; i++) {
				sb.append(" ");
			}
			for (int i = N; i > copyN; i--) {
				sb.append('*');
			}
			sb.append("\n");
		}
		copyN = 0;
		while(copyN++ < N - 1) {
			for (int i = 0; i < copyN; i++) {
				sb.append(" ");
			}
			for (int i = N; i > copyN; i--) {
				sb.append('*');
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		
	}

}
