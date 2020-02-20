package b_2839;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2839
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		while(true) {
			//��� ��
			if (N == 0)
				break;
			//���� kg �� 3kg ���� ������ �� �̻� ��� �Ұ���
			if (N < 3) {
				count = -1;
				break;
			}
			
			//5�� ����� 5kg ���θ� �ذ� ����
			if (N % 5 == 0) {
				count++;
				N -= 5;
			}
			//5kg ¥�� ������ ����ϰ����� �ּ� ������ 3kg���� ��� �������� Ȯ�� 
			else if (((N - 5) % 3 == 0)) {
				count++;
				N -= 5;
			} 
			//3kg ���θ� �ذᰡ������ Ȯ�� ���� (N % 3 == 0 �� ��) + ��� �Ұ����� ��츦 ����Ͽ� else �� ó���Ͽ� N �� ���� �ٿ�����
			else {
				count++;
				N -= 3;
			}
		}
		
		System.out.print(count);

	}

}
