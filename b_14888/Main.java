package b_14888;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static long min;
	static long max;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] num = new int[n];
		int[] op = new int[4];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(bf.readLine());
		ArrayList<Character> chOp = new ArrayList<Character>();
		for (int i = 0; i < op.length; i++) {
			op[i] = Integer.parseInt(st.nextToken());
			for (int j = 0; j < op[i]; j++) {
				if (i == 0)
					chOp.add('+');
				else if (i == 1)
					chOp.add('-');
				else if (i == 2)
					chOp.add('x');
				else
					chOp.add('/');
			}
		}
		
		boolean[] visited = new boolean[chOp.size()];
			
		max = -1000000000;
		min = 1000000000;
		
		func(n, 0, visited, num, chOp, num[0]);
		
		System.out.print(max +"\n" + min);
	}
	
	static public void func(int n, int pos, boolean[] visited, int[] num, ArrayList<Character> chOp, long k) {
		long result = 0;
		
		if (pos == n - 1) {
			if (k < min)
				min = k;
			
			if (k > max)
				max = k;	
			return;
		}
		for (int i = 0; i < chOp.size(); i++) {
			if (!visited[i]) {
				visited[i] = true;
				if (chOp.get(i) == '+') {
					result = k + num[pos + 1];
				} else if (chOp.get(i) == '-') {
					result = k - num[pos + 1];
				} else if (chOp.get(i) == 'x') {
					result = k * num[pos + 1];
				} else {
					result = k / (long) num[pos + 1];
				}
				func(n, pos + 1, visited, num, chOp, result);
				visited[i] = false;
			}
		}
	}

}
