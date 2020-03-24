package b_15650;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		int[] array = new int[m];
		boolean[] visited = new boolean[n + 1];
		
		func(n, m, array, visited, 0, 1);
	}
	
	static public void func(int n, int m, int[] array, boolean[] visited, int pos, int min) {
		if (pos == m) {	
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < array.length; i++) {
				sb.append(array[i] + " ");
			}
			System.out.println(sb.toString());
			return;
		}
		
		for (int i = min; i <= n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				array[pos] = i;
				func(n, m, array, visited, pos + 1, i + 1);
				visited[i] = false;
			}
		}
	}
}
