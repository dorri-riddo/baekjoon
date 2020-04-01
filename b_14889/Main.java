package b_14889;

import java.io.*;
import java.util.*;

public class Main {

	static int min = 100;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[][] array = new int[n][n];
		boolean[] visited = new boolean[n];
		StringTokenizer st;
		for (int i = 0; i < array.length; i++) {
			st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bf.close();
			
		func(-1, n, 0, visited, array, 0);
		System.out.print(min);

	}
	
	static public void func(int cur, int n, int pos, boolean[] visited, int[][] array, int cnt) {
		if (pos == n / 2) {
			ArrayList<Integer> startList = new ArrayList<Integer>();
			ArrayList<Integer> linkList = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				if (visited[i])
					startList.add(i);
				else
					linkList.add(i);
			}
			
			int start = 0;
			int link = 0;
			
			for (int i = 0; i < startList.size(); i++) {
				for (int j = i + 1; j < startList.size(); j++) {
					start += array[startList.get(i)][startList.get(j)] + array[startList.get(j)][startList.get(i)];
					link += array[linkList.get(i)][linkList.get(j)] + array[linkList.get(j)][linkList.get(i)];
				}
			}
			
			if (min > (int) Math.abs(start - link))
				min = (int) Math.abs(start - link);
			
			return;
		}
		for (int i = cur + 1; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				func(i, n, pos + 1, visited, array, cnt);
				visited[i] = false;
			}
		}
	}
	

}
