package b_7568;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	//https://www.acmicpc.net/problem/7568
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[][] array = new int[N][2];
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for (int i = 0; i < array.length; i++) {
			st = new StringTokenizer(bf.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = 0; j < array.length; j++) {
				if (i == j)
					continue;
				if (array[i][0] < array[j][0] && array[i][1] < array[j][1])
					count++;
			}
			sb.append(count + " ");
		}
		
		System.out.print(sb.toString());

	}

}
