package b_2448;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2448
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		char[][] array = new char[N][N * 2 - 1];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = ' ';
			}
		}
		
		array = func(0, (2 * N - 1) / 2, N, array);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				sb.append(array[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		
	}
	
	public static char[][] func(int x, int y, int num, char[][] array) {
		if (num == 3) {
			array[x][y] = '*';
			array[x + 1][y - 1] = '*';
			array[x + 1][y + 1] = '*';
			for (int i = y - 2; i <= y + 2; i++) {
				array[x + 2][i] = '*';
			}
			return array;
		} else {
			/*
			 	*
			   * *
			  ***** 
			  패턴이 계속해서 반복함 
			 하나의 패턴 아래에 두 개의 패턴이 달리고, 다시 두 패턴 각각에 하나의 패턴으로 되돌아오는 형태			 			 
			 */
			
			// 패턴끼리는 temp 만큼 떨어져 있다
			int temp = num / 2;
			for (int i = 0; i < 2; i++) {
				// 첫 번째 맨 위 하나의 패턴
				if (i == 0)
					array = func(x + temp * i, y - temp * i,  temp, array);
				else {
					// 두 번째 아래 처음 패턴
					array = func(x + temp * i, y - temp * i,  temp, array);
					// 두 번째 아래 마지막 패턴
					array = func(x + temp * i, y + temp * i,  temp, array);
				}			
			}
			
			return array;
		}
			
	}
}
