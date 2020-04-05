package b_1904;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		long[] array = new long[1000001];
		array[1] = 1;
		array[2] = 2;
		
		System.out.print(func(n, array));
	}
	
	// n - 1 �� ��쿡���� �ڿ� 1 �� ���̸� �ȴ� 
	// n - 2 �� ��쿡���� �ڿ� 00 �� ���̸� �ȴ�
	// ���� array[n] = array[n - 1] + array[n - 2]
	static public long func(int n, long[] array) {
		if (n == 0)
			return 0;
		if (array[n] != 0)
			return array[n];
		array[n] = func(n - 1, array) + func(n - 2, array);
		return array[n] % 15746;
	}

}
