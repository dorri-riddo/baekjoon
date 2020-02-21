package b_2869;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2869
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		// (V - B) : ������ ���� �������� �����״� B ���� �Ÿ���ŭ ������ �ȴ�
		// (A - B) : �Ϸ翡 �ö� �� �ִ� �Ÿ� 
		// ��� ����� �� �������� �׳������� ������ �ȴ�. ������ �������� ���� ��쿣 �� �� �� �ö󰡾� �ϹǷ� 1�� ���ؾ� ��.
		if ((V - B) % (A - B) == 0)
			System.out.println((V - B) / (A - B));
		else 
			System.out.print((V - B) / (A - B) + 1);		
		
	}
}
