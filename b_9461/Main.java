package b_9461;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long[] arr = new long[101];
		
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			int n = sc.nextInt();
			sb.append(func(arr, n) + "\n");
		}
		sc.close();
		System.out.print(sb.toString());
	}
	
	static public long func(long[] arr, int n) {
		if (arr[n] != 0)
			return arr[n];
		arr[n] = func(arr, n - 2) + func(arr, n - 3);
		return arr[n];
	}
}
