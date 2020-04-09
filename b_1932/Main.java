package b_1932;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for (int j = 0; j <= i; j++) {
				dp[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0)
					dp[i][j] = dp[i - 1][j] + dp[i][j];
				else if (j == i)
					dp[i][j] = dp[i - 1][j - 1] + dp[i][j];
				else
					dp[i][j] = max(dp[i][j] + dp[i - 1][j - 1], dp[i][j] + dp[i - 1][j]);
			}
		}
		int max = dp[n - 1][0];
		for (int i = 1; i < n; i++) {
			if (max < dp[n - 1][i])
				max = dp[n - 1][i];
		}
		System.out.print(max);
	}
	
	public static int max(int x, int y) {
		if (x < y)
			return y;
		return x;
	}
}
