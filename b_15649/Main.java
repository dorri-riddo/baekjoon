package b_15649;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] array = new int[m];
		boolean[] visited = new boolean[n + 1];
		sc.close();
		
		func(n, m, array, visited, 0);
	}

	// 백 트래킹 알고리즘
	public static void func(int n, int m, int[] array, boolean[] visited, int pos) {
		if (pos == m) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < array.length; i++) {
				sb.append(array[i] + " ");
			}
			System.out.print(sb.toString() + "\n");
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				array[pos] = i;
				visited[i] = true;
				func(n, m, array, visited, pos + 1);
				visited[i] = false;
			}
		}
	}
}
