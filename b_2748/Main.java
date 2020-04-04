package b_2748;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		long[] array = new long[101];
		array[1] = 1;
		array[2] = 1;
		
		System.out.print(fibo(n, array));
	}

	public static long fibo(int n, long[] array) {
		if (n == 0)
			return 0;
		if (array[n] != 0)
			return array[n];
		
		array[n] = fibo(n - 1, array) + fibo(n - 2, array);
		return array[n];
	}

}
