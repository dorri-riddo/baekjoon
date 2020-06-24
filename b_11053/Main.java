package b_11053;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int[] arr = new int[A];
		int[] dp = new int[A];
		
		for (int i = 0; i < A; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.fill(dp, 1);

		
		int cnt = dp[0];
		
		for (int i = 1; i < A; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dp[i] < dp[j] + 1 ) {
					dp[i] = dp[j] + 1;
				}
			}
			if (cnt < dp[i]) {
				cnt = dp[i];
			}				
		}
		
		System.out.print(cnt);
	}

}
