package b_9663;

import java.util.Scanner;

public class Main {
	
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] arr = new int[n];
		
		func(0, n, arr);
		System.out.print(cnt);
	}
	
	static public void func(int pos, int n, int[] arr) {
		if (pos == n) {
			cnt++;
			return;
		}
		
		// i �� �� �̵� ���
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < pos; j++) {
				// arr[j] == i => ������ ���� �ٸ� ���� �� �� ����
				// (int) Math.abs(arr[j] - i) == (int) Math.abs(j - pos) => ������ �밢���� �ٸ� ���� �� �� ����
				// �밢���� ���� : ���ο� ������ ���̰� ����
				if (arr[j] == i || (int) Math.abs(arr[j] - i) == (int) Math.abs(j - pos)) {
					flag = false;
					break;
				}
			}
			// pos �� �� ��ġ
			if (flag) {
				// pos �� �迭 ��ġ�� ���, �� �� ��ġ�� �� ��ġ�� �ִ´�
				arr[pos] = i;
				func(pos + 1, n, arr);
			}
		}

	}
}
