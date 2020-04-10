package b_2579;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		long[] arr = new long[300];
		long[] dp = new long[300];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		bf.close();
		
		dp[0] = arr[0];
		dp[1] = arr[0] + arr[1];
		dp[2] = max(arr[1] + arr[2], arr[0] + arr[2]);
						
		for (int i = 3; i < n; i++) {
			dp[i] = max(arr[i] + dp[i - 2], arr[i] + arr[i - 1] + dp[i - 3]);
		}
		
		
		System.out.print(dp[n - 1]);
	}
	
	static public long max(long l, long m) {
		if (l > m)
			return l;
		return m;
	}
}
