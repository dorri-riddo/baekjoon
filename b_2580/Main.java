package b_2580;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		StringTokenizer st;
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bf.close();
		
		func(arr, 0);
	}

	static public void func(int[][] arr, int pos) {
		if (pos == 81) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					sb.append(arr[i][j] + " ");
				}
				sb.append("\n");
			}
			System.out.print(sb.toString());
			System.exit(0);
		}
		
		int x = pos / 9;
		int y = pos % 9;
		
		if (arr[x][y] != 0)	{
			func(arr, pos + 1);
		} else {			
			boolean[] visited = new boolean[10];
			for (int i = 0; i < 9; i++) {
				// 가로 비교
				if (arr[x][i] != 0) {
					visited[arr[x][i]] = true;
				}
				// 세로 비교
				if (arr[i][y] != 0) {
					visited[arr[i][y]] = true;
				}
			}
			
			int k;
			int j;
			if (x < 3)
				k = 0;
			else if (x < 6)
				k = 3;
			else
				k = 6;
			
			if (y < 3)
				j = 0;
			else if (y < 6)
				j = 3;
			else
				j = 6;
			
			// 3x3 비교
			for (int i = 1; i <= 9; i++) {
				if (arr[k][j] != 0) {
					visited[arr[k][j]] = true;
				}
				k++;
				if (i % 3 == 0) {
					k -= 3;
					j++;
				}
			}
				
			
			for (int i = 1; i < visited.length; i++) {
				if (!visited[i]) {
					arr[x][y] = i;
					func(arr, pos + 1);
				}
			}
			
			// 스도쿠 안에 들어갈 숫자가 없을 경우 이전 작업을 원상복귀
			arr[x][y] = 0;
			return;
		}
	}	
}
