package b_3053;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/3053
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		
		// �������� R �� ���� ���� ���� ���� ( r * r * pi)
		System.out.println(String.format("%.6f", Math.PI * R * R));
		// �ý� �����п��� �� = ������
		// ���� �밢���� �� ���̰� R �� ������ ���� ���� ���� (r * 2 * r * 2 * (1/2) = r * r * 2) 
		// �� r * 2 => r �� ���̴� �������̹Ƿ� �밢���� ���̴� 2 * r �̴�. 
		System.out.println(String.format("%.6f", R * R * 2.0));
	}
}
