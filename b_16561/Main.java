package b_16561;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/16561
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int count = 0;
		int k = 1;
		
		// n = 9 ����� �� : 1��
		// n = 12 ����� �� : 3��
		// n = 15 ����� �� : 6��
		// n = 18 ����� �� : 10��
		// D[n + 1] = D[n] + n �� ��Ģ�� �ִ�
		for (int i = 0; i < n / 3 - 2; i++) {
			count += k;
			k++;
		}
		
		// �ϳ��� ����� ����� �˰���
		// �ٸ� �ð��ʰ��ȴ� 
//		int count = 0;
//		for (int i = 3; i <= n - 6; i += 3) {
//			for (int j = 3; j <= n - 3; j += 3) {
//				for (int k = 3; k <= n; k += 3) {
//					if (i + j + k == n)
//						count++;
//				}
//			}
//		}
		
		System.out.print(count);
	}
}
