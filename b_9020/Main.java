package b_9020;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/9020
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] array = new int[10001];
		
		for (int i = 1; i < array.length; i++) {
			array[i] = i;
		}
		
		// �����佺�׳׽��� ü �˰����� �̿��Ͽ� �迭�� �Ҽ��� ���ܵд�
		for (int i = 2; i < array.length; i++) {
			if (array[i] == 0)
				continue;
			int num = i;
			while(num + i < array.length) {
				array[num += i] = 0;
			}
		}

		int T = sc.nextInt();
		
		while(T-- > 0) {
			int n = sc.nextInt();
			String result = "";
			int sub = 10000;
			
			for (int i = 2; i <= n; i++) {
				// 1�� �Ҽ��� �ƴϹǷ� �н�
				if (array[n - array[i]] == 1)
					continue;
				// n = 8, i = 2 �� ����
				// array[n - array[i]] �� 6�� ��ġ�� �迭 ���� 0�̹Ƿ� 2+6=8 ������ �Ҽ������� ������ �ƴϴ�.
				// ����� �ݺ��Ͽ� �Ҽ������� ���� ��츦 ã�´� (�迭���� 0�̾�� �ȵ�)
				if (array[n - array[i]] != 0) {
					// ��찡 �������� ��� �� �Ҽ��� ���̰� ���� ���� ��츦 ����ϹǷ� sub ������ ���� ���̰� ���� ������ Ȯ���Ѵ�
					// �� �Ҽ��� ���̰� ������ ������ ��� ó�� ��꿡�� �ݴ�� ��� (ex n=10, 3 7 �� 7 3) �� �� �� ���̹Ƿ� 0���� Ŀ�� �Ѵ�
					// n = 10 �� ��� 5,5 �� �ֵ��� ���̰� 0�� ���� ������ ���ο� �־� �Ѵ�
					if (array[n - array[i]] - array[i] < sub && array[n - array[i]] - array[i] >= 0) {
						result = i + " " + array[n - array[i]];
						sub = array[n - array[i]] - array[i];
					}
				}
			}
			
			sb.append(result + "\n");
		}
		
		System.out.print(sb.toString());
	}

}
