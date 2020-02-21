package b_2775;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2775
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		
		while(T-- > 0) {
			int[][] array = new int[15][15];
			for (int i = 0; i < array.length; i++) {
				array[0][i] = i + 1;
			}
			
			
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			for (int i = 1; i <= k; i++) {
				for (int j = 1; j <= n; j++) {
					for (int m = 0; m < j; m++) {
						array[i][j - 1] += array[i - 1][m];
					}
				}
			}
			
			sb.append(array[k][n - 1] + "\n");
		}

		System.out.print(sb.toString());
	}

}
