package b_1149;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(bf.readLine());
		int[][] array = new int[n + 1][4];
		int[][] dp = new int[n + 1][4];
		
		for (int i = 1; i < array.length; i++) {
			st = new StringTokenizer(bf.readLine());
			for (int j = 1; j < array[0].length; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 1; i <= 3; i++) {
			dp[1][i] = array[1][i];
		}
		bf.close();
		
		System.out.print(func(n, array, dp));

	}
	
	public static int min(int x, int y) {
		if (x > y)
			return y;
		else 
			return x;
	}

	// 모든 경우의 수에 대해서 최솟값을 계산하는 방법
	public static int func(int n, int[][] array, int[][] dp) {
		for (int i = 2; i <= n; i++) {
			//ex) 두 번째 집을 R 로 색칠 -> 첫 번째 집은 G와 B중 최솟값 찾기 -> 그 때에 비용을 dp 에 저장
			dp[i][1] = min(dp[i - 1][2], dp[i - 1][3]) + array[i][1];
			dp[i][2] = min(dp[i - 1][1], dp[i - 1][3]) + array[i][2];
			dp[i][3] = min(dp[i - 1][1], dp[i - 1][2]) + array[i][3];
		}
		// 모든 계산을 마치면 dp 배열에는 RGB 각 경우에 대해서 최소비용이 나온다.
				
		return min(min(dp[n][1], dp[n][2]), dp[n][3]);
	}

}
