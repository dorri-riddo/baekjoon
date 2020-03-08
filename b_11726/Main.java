package b_11726;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/11726
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int[] array = new int[1001];
		array[1] = 1;
		array[2] = 2;
		
		int result = tiling(n, array);
		System.out.print(result);
	}
	
	// n - 2 경우의 수에 1 X 2 타일 2개를 덧붙이면 된다
	// n - 1 경우의 수에 2 X 1 타일 1개를 덧붙이면 n 의 경우가 나온다.
	// D[n] = D[n-1]+D[n-2]
	public static int tiling(int n, int[] array) {
		if (array[n] != 0)
			return array[n];
		else {
			array[n] = (tiling(n - 1, array) + tiling(n - 2, array)) % 10007;
			return array[n];
		}
	}

}
