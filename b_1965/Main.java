package b_1965;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		Arrays.fill(dp, 1);
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int maxCnt = -1;
		for (int i = 1; i < n; i++) {
			int cnt = 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
					cnt++;
				}
			}
			
			if (maxCnt < cnt) {
				maxCnt = cnt;
			}
		}
		
		System.out.print(maxCnt);

	}

}
