package b_1676;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		sc.close();
		
		// 2*5 혹은 10/20/30... 일 때마다 횟수가 늘어남.
		for (int i = 5; i <= n; i*=5) {
			cnt += n / i;
		}
		System.out.print(cnt);
	}

}
