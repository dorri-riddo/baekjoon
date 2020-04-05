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
	
	// n - 1 의 경우에서는 뒤에 1 을 붙이면 된다 
	// n - 2 의 경우에서는 뒤에 00 을 붙이면 된다
	// 따라서 array[n] = array[n - 1] + array[n - 2]
	static public long func(int n, long[] array) {
		if (n == 0)
			return 0;
		if (array[n] != 0)
			return array[n];
		array[n] = func(n - 1, array) + func(n - 2, array);
		return array[n] % 15746;
	}

}
