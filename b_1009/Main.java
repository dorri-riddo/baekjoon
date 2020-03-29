package b_1009;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 10 대의 컴퓨터이기 때문에 일의자리 제곱수의 끝자리수 = 마지막 분산처리 하는 컴퓨터 
		// 끝자리수는 특정 숫자를 반복하기 때문에 이를 배열에 넣는다 
		int[][] arr = { {10},
				{1},
				{2,4,8,6},
				{3,9,7,1},
				{4,6},
				{5},
				{6},
				{7,9,3,1},
				{8,4,2,6},
				{9,1}
		};
				
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		int[][] array = new int[T][2];
		StringTokenizer st;
		for (int i = 0; i < array.length; i++) {
			st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bf.close();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < array.length; i++) {
			char ch = ("" + array[i][0]).charAt(("" + array[i][0]).length() - 1);
			int k = array[i][1] % arr[ch - '0'].length - 1;
			if (k == -1)
				k = arr[ch - '0'].length - 1;
			sb.append(arr[ch - '0'][k] + "\n");
		}
		
		System.out.print(sb.toString());
	}
}
