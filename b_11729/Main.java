package b_11729;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/11729
	
	static StringBuilder sb;
	static int count;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder();
		count = 0;
		
		int N = sc.nextInt();
		hanoi(1, 2, 3, N);
		
		System.out.print(count + "\n" + sb.toString());

	}
	
	public static void move(int from, int to) {
		sb.append(from + " " + to + "\n");
		count++;
	}
	
	public static void hanoi(int from, int by, int to, int num) {
		if (num == 1)
			move(from, to);
		else {
			// �� ������ ������ �����ϰ� ���� ��� ž���� �̵�
			hanoi(from, to, by, num - 1);
			// �� ������ ����(���� ū ����)�� ������ ž���� �̵�
			move(from, to);
			// ��� ž�� �ִ� ������ ������ ž���� �̵�
			hanoi(by, from, to, num - 1);
		}
	}
}
