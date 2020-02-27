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
		
		//�� �� �� �۵��ؾ� �ϱ� ������ temp �� �� ���� �������� ����
		int temp = num / 3;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				//��� �κп� �ش��ϴ� ���� �ƹ��͵� �۵����� ����
				//�ٷ� j = 2�� ������ * �迭 ����
				if (i == 1 && j == 1);
				else 
					// ��Ģ : ���� ��ġ���� temp ��ŭ �þ ���� ���� �����ϴ� ��
					// 1/3 �� �ɰ� ������ ���� 
					// ex) 9X9 ù ��° ���� ��쿡�� ���� ���� 0~2 / 3~5 / 6~8 �� ����
					// ó������ (x + temp * i, y + temp * j) �� (0, 0), (0, 3), (0,6) ���� ����
					// (0,0) �� �ٽ� ����Լ��� (0,0) (0,1) (0,2)  
					// (0,3) �� (0,3) (0,4) (0,5)
					// (0,6) �� (0,6) (0,7) (0,8) �� ����ؼ� 1/3 �� �ɰ��� ����Ѵ� 
					array = print(x + temp * i, y + temp * j, temp, array);
			}
		}
		
		return array;
	}

}
