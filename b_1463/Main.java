package b_1463;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/1463
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] array = new int[101];
		array[1] = 0;
		array[2] = 1;
		array[3] = 1;
		
		// 1. 3���� ������ �������� 3���� ������. -> n / 3 �� ��쿡��  Ƚ�� + 1 �� �ϸ� �� (n / 3 �� ���� ����� ���� �� �� ������� �ϹǷ�)
		// ex n = 9 �� ��� n = 3 ���� ����� �� Ƚ��  + 1 �� �߰��ǰ�, ���Ŀ� n = 3 �� n = 1 �� ����µ� ��� Ƚ���� ���ϸ� �ȴ�.
		// 2. 2�� ������ �������� 2�� ������. -> n / 2 �� ��쿡�� Ƚ�� + 1 �� �ϸ� ��
		// 3. 1�� ����. -> (n - 1) �� ��쿡�� n ���� - 1 �� �� Ƚ�� 1ȸ�� ���ϸ� �ȴ�. 
		
		for (int i = 4; i <= n; i++) {
			// 10 �� ��쿡�� �ٷ� 2�� ���� �ͺ��� 9 ��� ������� -1 �� ����� �ϳ� ���ϴ� �� ������
			// ������ - 1 �� ���� �� ����� ���� ���� ����ϰ� ���� 3���� ������ �� Ȥ�� 2�� ������ �� min �Լ��� ���
			array[i] = array[i - 1] + 1;
			if (i % 3 == 0)
				array[i] = min(array[i], array[i / 3] + 1);
			else if (i % 2 == 0)
				array[i] = min(array[i], array[i / 2] + 1);
		}
		
		System.out.print(array[n]);
	}
	
	public static int min(int x, int y) {
		if (x > y)
			return y;
		else
			return x;
	}
}
