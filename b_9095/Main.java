package b_9095;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/9095
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		
		while(T-- > 0) {
			int n = sc.nextInt();
			sb.append(func(n) + "\n");
		}
		
		System.out.print(sb.toString());

	}

	// ex) num = 4
	// num=1 �� ��쿡��  + 3 �� �ϴ� ����� ��
	// num=2 �� ��쿡 + 2 �� �� ���
	// num=3 ���� + 1 �� �ϸ� num=4�� ���� ����� ���� ���� ���´� 
	// ���� 1,2,3�� ���� ����� ���� ���ϸ� �ȴ� (�� ����� ������ ���� +1 +2 +3 �� �ϸ� �ǹǷ�)
	public static int func(int num) {
		if (num == 1)
			return 1;
		else if (num == 2)
			return 2;
		else if (num == 3)
			return 4;
		else {
			return func(num - 1) + func(num - 2) + func(num - 3);
		}
	}
}
