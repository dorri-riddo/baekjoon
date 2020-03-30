package b_9663;

import java.util.Scanner;

public class Main {
	
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] arr = new int[n];
		
		func(0, n, arr);
		System.out.print(cnt);
	}
	
	static public void func(int pos, int n, int[] arr) {
		if (pos == n) {
			cnt++;
			return;
		}
		
		// i 는 열 이동 담당
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < pos; j++) {
				// arr[j] == i => 동일한 열에 다른 퀸을 둘 수 없다
				// (int) Math.abs(arr[j] - i) == (int) Math.abs(j - pos) => 동일한 대각선에 다른 퀸을 둘 수 없다
				// 대각선의 조건 : 가로와 세로의 길이가 동일
				if (arr[j] == i || (int) Math.abs(arr[j] - i) == (int) Math.abs(j - pos)) {
					flag = false;
					break;
				}
			}
			// pos 는 행 위치
			if (flag) {
				// pos 를 배열 위치로 삼아, 각 행 위치의 열 위치를 넣는다
				arr[pos] = i;
				func(pos + 1, n, arr);
			}
		}

	}
}
