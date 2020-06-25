package b_6359;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while (T-- > 0) {
			int n = sc.nextInt();
			if (n == 0) {
				sb.append(0 + "\n");
				continue;
			}
			int[] arr = new int[n + 1];
			Arrays.fill(arr, 1);
			for (int i = 2; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j % i == 0) {
						if (arr[j] == 1) {
							arr[j] = 0;
						} else {
							arr[j] = 1;
						}
					}
				}
			}
			
			int cnt = 0;
			for (int i = 1; i <= n; i++) {
				if (arr[i] == 1) {
					cnt++;
				}
			}
			sb.append(cnt + "\n");
		}
		System.out.print(sb.toString());
		sc.close();
	}

}
