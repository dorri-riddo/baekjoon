package b_2445;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2445
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int copyN = N;
		int count = 1;
		
		while(copyN-- > 0) {
			for (int i = 0; i < count; i++) {
				sb.append("*");
			}
			
			for (int i = count; i < N; i++) {
				sb.append("  ");
			}
			
			// ��Ī�̹Ƿ� �� ó�� �Ͱ� ����
			for (int i = 0; i < count; i++) {
				sb.append("*");
			}
			sb.append("\n");
			count++;
		}
		
		count -= 2;
		
		while(copyN++ < N) {
			for (int i = 0; i < count; i++) {
				sb.append("*");
			}
			
			for (int i = count; i < N; i++) {
				sb.append("  ");
			}
			
			for (int i = 0; i < count; i++) {
				sb.append("*");
			}
			sb.append("\n");
			count--;
		}
		
		System.out.print(sb.toString());

	}

}
