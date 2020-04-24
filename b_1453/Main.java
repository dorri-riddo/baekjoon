package b_1453;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[101];
		int cnt = 0;		
		while(n-- > 0) {
			int tmp = sc.nextInt();
			if (arr[tmp] == 1)
				cnt++;
			else
				arr[tmp]++;
		}
		sc.close();
		System.out.print(cnt);
	}
}
