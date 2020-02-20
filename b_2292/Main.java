package b_2292;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2292
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int[] array = new int[20001];
		array[0] = 1;
		
		while(true) {
			if (N == 1) {
				count = 1;
				break;
			}
			count++;
			// 7������ �� ��, 19������ �� ��, 27������ �� ���� �������� �ϴ� �� D[n] = D[n - 1] + 6n �� ��Ģ�� �ִ�. 
			// �� ��Ģ���� ���� ��쿣 �� �������� �ϹǷ� array �迭�� ���ο� D[n] �� �ְ� count �� �÷� ���� ����Ѵ�.
			if (6 * count + array[count - 1] < N) {
				array[count] = 6 * count + array[count - 1];
			} 
			//���������Ƿ� ���� ��ġ�� ���ؼ� count++ �� �ϰ�, while ���� ������. 
			else {
				count++;
				break;
			}
		}
		
		System.out.print(count);
	}

}
