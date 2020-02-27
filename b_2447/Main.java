package b_2447;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2447
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		char[][] array = new char[N][N];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = ' ';
			}
		}
	
		array = print(0, 0, N, array);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sb.append(array[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());

	}
	
	public static char[][] print(int x, int y, int num, char[][] array) {
		if (num == 1) {
			array[x][y] = '*';
			return array;
		}
		
		//총 세 번 작동해야 하기 때문에 temp 로 그 세번 기준점을 결정
		int temp = num / 3;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				//가운데 부분에 해당하는 곳엔 아무것도 작동하지 않음
				//바로 j = 2인 곳부터 * 배열 삽입
				if (i == 1 && j == 1);
				else 
					// 규칙 : 원래 위치에서 temp 만큼 늘어난 곳이 새로 시작하는 곳
					// 1/3 씩 쪼개 나가는 형태 
					// ex) 9X9 첫 번째 행의 경우에는 행의 열이 0~2 / 3~5 / 6~8 로 나뉨
					// 처음에는 (x + temp * i, y + temp * j) 로 (0, 0), (0, 3), (0,6) 으로 나뉨
					// (0,0) 은 다시 재귀함수로 (0,0) (0,1) (0,2)  
					// (0,3) 은 (0,3) (0,4) (0,5)
					// (0,6) 은 (0,6) (0,7) (0,8) 로 계속해서 1/3 씩 쪼개서 계산한다 
					array = print(x + temp * i, y + temp * j, temp, array);
			}
		}
		
		return array;
	}

}
