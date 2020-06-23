package b_11055;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int[] arr = new int[A];
		int[] dp = new int[A];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			dp[i] = arr[i];
		}
		sc.close();

		int max = dp[0];
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dp[i] < dp[j] + arr[i]) {
					dp[i] = dp[j] + arr[i];
				}
			}
			
			if (max < dp[i]) {
				max = dp[i];
			}
		}
		
		System.out.println(max);
	}

}
